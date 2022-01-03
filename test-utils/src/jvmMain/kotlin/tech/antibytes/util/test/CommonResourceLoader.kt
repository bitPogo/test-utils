/*
 * Copyright (c) 2021 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by LGPL v2.1
 */

package tech.antibytes.util.test

import tech.antibytes.util.test.CommonPathResolver.UTF_8
import tech.antibytes.util.test.error.FileNotFoundError
import java.io.File
import java.nio.charset.Charset

actual class CommonResourceLoader actual constructor(projectDir: AbsolutePath) {
    private val projectPath = projectDir

    actual fun exists(path: Path, root: Path?): Boolean {
        val resource = File(
            CommonPathResolver.resolvePath(
                projectPath,
                root,
                path
            )
        )

        return resource.exists()
    }

    @Throws(FileNotFoundError::class)
    private fun resolveFile(path: Path, root: Path?): File {
        val resource = File(
            CommonPathResolver.resolvePath(
                projectPath,
                root,
                path
            )
        )

        return if (!resource.exists()) {
            throw FileNotFoundError()
        } else {
            resource
        }
    }

    @Throws(FileNotFoundError::class)
    actual fun load(
        path: Path,
        root: Path?
    ): String = resolveFile(path, root).readText(Charset.forName(UTF_8))

    @Throws(FileNotFoundError::class)
    actual fun loadBytes(
        path: Path,
        root: Path?
    ): ByteArray = resolveFile(path, root).readBytes()
}
