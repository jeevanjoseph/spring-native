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
package org.springframework.nativex.type;

import java.util.List;

/**
 * Implementors of this have the ability to filter down the entries in a spring.factories file that should
 * go through full processing.
 * 
 * @author Andy Clement
 */
public interface SpringFactoriesProcessor {

	public String enableAutoConfigurationKey = "org.springframework.boot.autoconfigure.EnableAutoConfiguration";
	public String applicationListenerKey = "org.springframework.context.ApplicationListener";

	boolean filter(String key, List<String> values);

}
