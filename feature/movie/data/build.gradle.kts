plugins {
    `android-library`
    `kotlin-android`
}

apply<ModuleGradlePlugin>()

android {
    namespace = "com.feature.movie.data"
}

dependencies {

    compose()
    hilt()
    retrofit()
    moshi()
}