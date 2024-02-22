/*
 * Copyright (c) 2024 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.util.test.annotations

import org.junit.jupiter.api.Disabled

actual typealias IgnoreAndroid = Disabled
actual annotation class IgnoreJvm
actual annotation class IgnoreJs
actual annotation class IgnoreNative
