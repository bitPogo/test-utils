/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture.qualifier

import tech.antibytes.util.test.fixture.PublicApi
import tech.antibytes.util.test.fixture.resolveClassName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TypeQualifierSpec {
    @Test
    fun `It fulfils Qualifier`() {
        val qualifier: Any = TypeQualifier(Int::class)

        assertTrue(qualifier is PublicApi.Qualifier)
    }

    @Test
    fun `It contains a value`() {
        val clazz = Int::class
        val qualifier = TypeQualifier(clazz)

        assertEquals(
            actual = qualifier.value,
            expected = resolveClassName(clazz)
        )
    }
}