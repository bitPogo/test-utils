/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture

import kotlin.reflect.KClass

@InternalAPI
expect fun <T : Any> resolveClassName(clazz: KClass<T>): String