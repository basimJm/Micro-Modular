plugins {
    `android-library`
    `kotlin-android`
}

apply<ModuleGradlePlugin>()

android {
    namespace = "com.feature.movie.ui"
}
dependencies {

    compose()
    hilt()
    retrofit()
    moshi()
}