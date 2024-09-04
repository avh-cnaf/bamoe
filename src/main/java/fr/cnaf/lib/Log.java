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
package fr.cnaf.lib;

import java.util.Objects;

import javax.enterprise.context.ApplicationScoped;

import fr.cnaf.domain.hello.Data;
import fr.cnaf.domain.hello.DataProcess;

@ApplicationScoped
public class Log {

    public static void toConsole(Data data) {
        System.out.println(data.toString());
    }

    public static void toConsole(String data) {
        System.out.println(data);
    }

    public static <T> void step(Data data, Class<T> cls, String func_name, String detail) {

        data.process.stepsNames.add(new DataProcess.Step<T>(cls, func_name, Objects.nonNull(detail) ? detail : null));
    }
}
