/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture.generator.primitive

import tech.antibytes.util.test.fixture.PublicApi
import kotlin.random.Random

internal class BooleanGenerator(
    private val random: Random
) : PublicApi.Generator<Boolean> {
    override fun generate(): Boolean = random.nextBoolean()
}
