plugins {
    `android-library`
    `kotlin-android`
}

apply<ModuleGradlePlugin>()

android {
    namespace = "com.feature.movie.data"
}

dependencies {
    api(project(":feature:movie:domain"))
    compose()
    hilt()
    retrofit()
    moshi()
}