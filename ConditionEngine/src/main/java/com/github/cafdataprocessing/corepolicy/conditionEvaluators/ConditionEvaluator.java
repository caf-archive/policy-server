/*
 * Copyright 2015-2017 EntIT Software LLC, a Micro Focus company.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cafdataprocessing.corepolicy.conditionEvaluators;

import com.github.cafdataprocessing.corepolicy.common.dto.CollectionSequence;
import com.github.cafdataprocessing.corepolicy.common.exceptions.CpeException;
import com.github.cafdataprocessing.corepolicy.document.DocumentUnderEvaluation;
import com.github.cafdataprocessing.corepolicy.common.dto.conditions.Condition;
import com.github.cafdataprocessing.corepolicy.common.EnvironmentSnapshot;

/**
 *
 * Interface for all condition evaluators
 *
 * The evaluators will be registered using the {ConditionClass}.class.getSimpleName() i.e. the class name
 * so they can be requested from spring.
 */
public interface ConditionEvaluator<T extends Condition> {

    ConditionEvaluationResult evaluate(CollectionSequence collectionSequence, DocumentUnderEvaluation document, T condition,
                                              EnvironmentSnapshot environmentSnapshot) throws CpeException;
}
