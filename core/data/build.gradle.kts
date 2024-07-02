plugins {
    `android-library`
    `kotlin-android`
}

apply<ModuleGradlePlugin>()

android {
    namespace = "com.core.data"
}

dependencies {
    compose()
    hilt()
    retrofit()
    moshi()
}