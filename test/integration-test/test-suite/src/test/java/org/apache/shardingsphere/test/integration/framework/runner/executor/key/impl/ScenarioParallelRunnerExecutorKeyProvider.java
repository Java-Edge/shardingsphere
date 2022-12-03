/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.test.integration.framework.runner.executor.key.impl;

import org.apache.shardingsphere.test.integration.framework.param.model.ITTestParameter;
import org.apache.shardingsphere.test.integration.framework.runner.ParallelRunningStrategy.ParallelLevel;
import org.apache.shardingsphere.test.integration.framework.runner.executor.key.ParallelRunnerExecutorKeyProvider;

/**
 * Scenario parallel runner executor key provider.
 */
public final class ScenarioParallelRunnerExecutorKeyProvider implements ParallelRunnerExecutorKeyProvider {
    
    @Override
    public String getKey(final ITTestParameter testParameter) {
        return String.join("-", testParameter.getAdapter(), testParameter.getScenario(), testParameter.getDatabaseType().getType());
    }
    
    @Override
    public ParallelLevel getParallelLevel() {
        return ParallelLevel.SCENARIO;
    }
}