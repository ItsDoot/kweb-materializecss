package io.kweb.plugins.materializecss

import io.kweb.plugins.KWebPlugin
import io.kweb.plugins.jqueryCore.jqueryCore

class MaterializeCssPlugin : KWebPlugin(dependsOn = setOf(jqueryCore)) {

    override fun decorate(startHead: StringBuilder, endHead: StringBuilder) {
        startHead.append(
            """
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
            <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
            <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
            """.trimIndent()
        )
    }
}

val materializeCssPlugin = MaterializeCssPlugin()

val materialize get() = MaterializeCssClasses()