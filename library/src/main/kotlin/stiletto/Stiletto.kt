/*
* Copyright (C) 2015 Vincent Mi
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

package stiletto

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

interface SingletonHolder {
  val singletonMap: ConcurrentMap<String, Any>

  final inline fun <reified T : Any> singleton(tag: String = "",
                                               initializer: () -> T): T {
    return singletonMap.concurrentGetOrPut("${T::class.java.name}.$tag ", initializer) as T
  }
}

public interface Module : SingletonHolder {}

public abstract class Component : SingletonHolder {
  override val singletonMap = ConcurrentHashMap<String, Any>()
}
