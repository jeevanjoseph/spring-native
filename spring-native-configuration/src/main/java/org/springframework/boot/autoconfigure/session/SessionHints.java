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
package org.springframework.boot.autoconfigure.session;

import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration.ReactiveSessionConfigurationImportSelector;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration.ServletSessionConfigurationImportSelector;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration.SessionConfigurationImportSelector;
import org.springframework.nativex.type.NativeConfiguration;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;

@NativeHint(trigger = ReactiveSessionConfigurationImportSelector.class, types =
	@TypeHint(types = {
			RedisReactiveSessionConfiguration.class,
			MongoReactiveSessionConfiguration.class,
			NoOpReactiveSessionConfiguration.class})
, abortIfTypesMissing = true)
@NativeHint(trigger = SessionConfigurationImportSelector.class, types =
	@TypeHint(types = {
			RedisSessionConfiguration.class,
			RedisReactiveSessionConfiguration.class,
			MongoSessionConfiguration.class,
			MongoReactiveSessionConfiguration.class,
			JdbcSessionConfiguration.class,
			HazelcastSessionConfiguration.class,
			NoOpSessionConfiguration.class,
			NoOpReactiveSessionConfiguration.class
	})
, abortIfTypesMissing = true, follow = true)
@NativeHint(trigger=ServletSessionConfigurationImportSelector.class, types = {
	@TypeHint(types= {
			RedisSessionConfiguration.class,
			MongoSessionConfiguration.class,
			JdbcSessionConfiguration.class,
			HazelcastSessionConfiguration.class,
			NoOpSessionConfiguration.class
	})
}, abortIfTypesMissing = true)
public class SessionHints implements NativeConfiguration {
}
