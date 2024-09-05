/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito;

import javax.enterprise.context.ApplicationScoped;

import org.kie.kogito.domain.Data;
import org.kie.kogito.domain.DataIn;
import org.kie.kogito.domain.DataOut;
import org.kie.kogito.domain.DataProcess.Step;
import org.kie.kogito.lib.Log;

@ApplicationScoped
public final class Process {

    public static void prepare_data(Data data, DataIn data_in, DataOut data_out) {

        Log.step(data, Process.class, "prepare_data", "Création de l'objet 'data' dans global");

        data.in = data_in;
        data.out = data_out;

        data.process.nb_pers_in = data.in.homeland.persons.size();
        data.process.adult_exists = Process.check_adult_present(data);
    }

    public static Boolean check_adult_present(Data data) {
        Log.step(data, Process.class, "check_adult_present", null);

        return data.in.homeland.persons.stream().anyMatch(p -> p.Age > 17);
    }

    public static DataOut prepare_data_out(Data data) {

        Log.step(data, Process.class, "prepare_data_out", " Livraison!!!! Chaud devant!!!!");

        data.process.stepsNames.stream()
                .map(Step::toString)
                .forEach(data.out.processedBy::add);

        data.out.resultCode = 0;
        data.out.resultCodeLabel = "Ca marche!!! Ich weisse nicht?";

        return data.out;
    }
}
