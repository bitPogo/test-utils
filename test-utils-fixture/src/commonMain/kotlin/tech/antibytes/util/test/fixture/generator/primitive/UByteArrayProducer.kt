/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture.generator.primitive

import tech.antibytes.util.test.fixture.FixtureContract
import kotlin.random.Random
import kotlin.random.nextUBytes

internal class UByteArrayProducer(
    private val random: Random
) : FixtureContract.Producer<UByteArray> {
    override fun generate(): UByteArray {
        val size = random.nextInt(1, 100)
        return random.nextUBytes(size)
    }
}
