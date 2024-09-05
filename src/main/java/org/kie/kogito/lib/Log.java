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
package org.kie.kogito.lib;

import java.util.Objects;

import javax.enterprise.context.ApplicationScoped;

import org.kie.kogito.domain.Data;
import org.kie.kogito.domain.DataIn;
import org.kie.kogito.domain.DataProcess;

@ApplicationScoped
public class Log {

    public static void toConsole(Data data) {
        System.out.println(data.toString());
    }

    public static void toConsole(DataIn data_in) {
        System.out.println(data_in.toString());
    }

    public static void toConsole(String data) {
        System.out.println(data);
    }

    public static <T> void step(Data data, Class<T> cls, String func_name, String detail) {

        DataProcess.Step<T> step = new DataProcess.Step<T>(cls, func_name, Objects.nonNull(detail) ? detail : null);
        Log.toConsole(step.toString());
        data.process.stepsNames.add(step);
    }
}
