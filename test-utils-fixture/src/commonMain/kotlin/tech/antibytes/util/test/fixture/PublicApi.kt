/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture

import kotlin.random.Random
import kotlin.reflect.KClass

interface PublicApi {
    interface Generator<T : Any> {
        fun generate(): T
    }

    interface GeneratorFactory<T : Any> {
        fun getInstance(random: Random): Generator<T>
    }

    interface Qualifier {
        val value: String
    }

    interface Configuration {
        var seed: Int
        fun <T : Any> addGenerator(
            clazz: KClass<T>,
            factory: GeneratorFactory<T>,
            qualifier: Qualifier? = null
        ) : Configuration
    }

    interface Fixture {
        val random: Random
        val generators: Map<String, Generator<out Any>>
    }
}