/*
 * Copyright 2019 the original author or authors.
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
package org.springframework.nativex.domain.proxies;

import java.util.List;

import org.springframework.nativex.json.JSONArray;

/**
 * Converter to change reflection descriptor objects into JSON objects
 *
 * @author Andy Clement
 */
class ProxiesDescriptorJsonConverter {

	public JSONArray toJsonArray(ProxiesDescriptor metadata) throws Exception {
		JSONArray jsonArray = new JSONArray();
		for (ProxyDescriptor cd : metadata.getProxyDescriptors()) {
				jsonArray.put(toJsonArray(cd));
		}
		return jsonArray;
	}

	public JSONArray toJsonArray(ProxyDescriptor pd) throws Exception {
		JSONArray jsonArray = new JSONArray();
		List<String> interfaces = pd.getInterfaces();
		for (String intface: interfaces) {
			jsonArray.put(intface);
		}
		return jsonArray;
	}
}
