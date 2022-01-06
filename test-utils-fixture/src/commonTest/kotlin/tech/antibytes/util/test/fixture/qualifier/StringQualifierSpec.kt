/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture.qualifier

import tech.antibytes.util.test.fixture.FixtureContract.Companion.QUALIFIER_PREFIX
import tech.antibytes.util.test.fixture.PublicApi
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StringQualifierSpec {
    @Test
    fun `It fulfils Qualifier`() {
        val qualifier: Any = StringQualifier("asd")

        assertTrue(qualifier is PublicApi.Qualifier)
    }

    @Test
    fun `It has an value`() {
        val value = "ad"
        val qualifier = StringQualifier(value)

        assertEquals(
            actual = qualifier.value,
            expected = "${QUALIFIER_PREFIX}$value"
        )
    }
}