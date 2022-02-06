/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.fixture

import kotlin.reflect.KClass

// Ensure stable names
private val classNames: MutableMap<KClass<*>, String> = HashMap()

// TODO: since JS does not provide a package prefix, think about to make it more unique, while keeping the current behaviour
actual fun <T : Any> resolveClassName(clazz: KClass<T>): String {
    if (!classNames.containsKey(clazz)) {
        classNames[clazz] = clazz.simpleName ?: "KClass@${clazz.hashCode()}"
    }

    return classNames[clazz]!!
}
