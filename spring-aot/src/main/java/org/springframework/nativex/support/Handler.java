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
package org.springframework.nativex.support;

import org.springframework.nativex.type.TypeSystem;

/**
 * 
 * @author Andy Clement
 */
public class Handler {

	protected ConfigurationCollector collector;

	protected TypeSystem ts;

	Handler(ConfigurationCollector collector) {
		this.collector = collector;
	}
	
	public void setTypeSystem(TypeSystem ts) {
		this.ts = ts;
	}
}
