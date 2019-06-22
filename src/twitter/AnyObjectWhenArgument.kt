package twitter

/**
 * Any object can be an argument of a when statement.
 * https://twitter.com/kotlin/status/1142001713177681920?s=12
 */

fun main() {
    // even thought these parameters and the case statements in this function are in a different order,
    // this still works.
    println(supportedResolutions(UltrawideResolutions.UW5K, UltrawideResolutions.UW4K))
    println(supportedResolutions(UltrawideResolutions.UWUHD, UltrawideResolutions.UWHD))
}

enum class UltrawideResolutions(val resolution: String) {
    UWHD("2560x1080"),
    UWUHD("3440x1440"),
    UW4K("3840x1600"),
    UW5K("5120x2160")
}

private fun supportedResolutions(resOne: UltrawideResolutions, resTwo: UltrawideResolutions) = when (setOf(resOne, resTwo)) {
    setOf(UltrawideResolutions.UWHD, UltrawideResolutions.UWUHD) -> "normal"
    setOf(UltrawideResolutions.UW4K, UltrawideResolutions.UW5K) -> "expensive"
    else -> throw IllegalArgumentException("Unknown combination")
}