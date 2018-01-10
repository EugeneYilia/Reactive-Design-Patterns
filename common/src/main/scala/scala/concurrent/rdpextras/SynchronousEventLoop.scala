/*
 * Copyright 2017 https://www.reactivedesignpatterns.com/ & http://rdp.reactiveplatform.xyz/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package scala.concurrent.rdpextras

import scala.concurrent.ExecutionContext
import scala.concurrent.Future

object SynchronousEventLoop extends ExecutionContext {
  override def execute(r: Runnable): Unit = Future.InternalCallbackExecutor.execute(r)
  override def reportFailure(t: Throwable): Unit = Future.InternalCallbackExecutor.reportFailure(t)
}