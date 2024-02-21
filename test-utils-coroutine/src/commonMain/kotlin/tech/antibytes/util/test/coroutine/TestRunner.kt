/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.coroutine

import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.test.TestCoroutineScheduler
import kotlinx.coroutines.test.TestScope

/*
 * see: https://github.com/Kotlin/kotlinx.coroutines/issues/1996
 */
expect object AsyncTestReturnValue
expect fun runBlockingTest(block: suspend TestScope.() -> Unit): AsyncTestReturnValue
expect fun runBlockingTestInContext(
    context: CoroutineContext,
    block: suspend CoroutineScope.() -> Unit,
): AsyncTestReturnValue

expect fun clearBlockingTest()

expect fun resolveMultiBlockCalls(): AsyncTestReturnValue
