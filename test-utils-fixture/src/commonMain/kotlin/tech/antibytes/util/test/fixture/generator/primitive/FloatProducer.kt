/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture.generator.primitive

import tech.antibytes.util.test.fixture.FixtureContract
import kotlin.random.Random

internal class FloatProducer(
    private val random: Random
) : FixtureContract.Producer<Float> {
    override fun generate(): Float = random.nextFloat()
}
