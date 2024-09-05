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
package org.kie.kogito.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DataProcess {
    public final List<Step<?>> stepsNames = Collections.synchronizedList(new ArrayList<Step<?>>());

    public Integer nb_pers_in = 0;
    public Boolean adult_exists = false;

    public static final class Step<T> {

        public final Class<T> cls;
        public final String func_name;
        public final String detail;

        public Step(Class<T> cls, String func_name, String detail) {
            this.cls = cls;
            this.func_name = func_name;
            this.detail = Objects.nonNull(detail) ? detail : "--";
        }

        @Override
        public String toString() {
            return this.cls.getCanonicalName() + "." + this.func_name + "  " + this.detail;
        }
    }

}
