/*
 * Copyright 2020 the original author or authors.
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
package org.springframework.boot.actuate.autoconfigure.condition;

import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint.ApplicationConditionEvaluation;
import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint.ContextConditionEvaluation;
import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint.MessageAndCondition;
import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint.MessageAndConditions;
import org.springframework.nativex.type.NativeConfiguration;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.hint.AccessBits;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

// Hitting /conditions endpoint
@NativeHint(trigger = ConditionsReportEndpointAutoConfiguration.class, types = {
	@TypeHint(types = {
		ConditionsReportEndpoint.class,
		ApplicationConditionEvaluation.class,
		ContextConditionEvaluation.class,
		MessageAndCondition.class,
		MessageAndConditions.class,
		MultiValueMap.class,
		LinkedMultiValueMap.class,
	},access = AccessBits.LOAD_AND_CONSTRUCT_AND_PUBLIC_METHODS)
})
public class ConditionsReportEndpointAutoConfigurationHints implements NativeConfiguration {
}