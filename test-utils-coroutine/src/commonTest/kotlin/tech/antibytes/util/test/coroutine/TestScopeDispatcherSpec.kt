/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.coroutine

import kotlinx.coroutines.Dispatchers
import tech.antibytes.util.test.annotations.IgnoreJs
import tech.antibytes.util.test.annotations.JsOnly
import tech.antibytes.util.test.fixture.fixture
import tech.antibytes.util.test.fixture.kotlinFixture
import tech.antibytes.util.test.isNot
import tech.antibytes.util.test.mustBe
import kotlin.js.JsName
import kotlin.test.Test

class TestScopeDispatcherSpec {
    private val fixture = kotlinFixture()

    @Test
    @JsName("fn1")
    @IgnoreJs
    fun `Given dispatch is called with a Scope name it dispatches a new CoroutineScope`() {
        // When
        val scope = TestScopeDispatcher.dispatch(fixture.fixture())

        // Then
        scope isNot Dispatchers.Default
        scope isNot Dispatchers.Main
    }

    @Test
    @JsName("fn2")
    @JsOnly
    fun `Given dispatch is called with a Scope name it dispatches the MainScope`() {
        // When
        val scope = TestScopeDispatcher.dispatch(fixture.fixture())

        // Then
        scope.toString().contains("Dispatchers.Main") mustBe true
    }
}
