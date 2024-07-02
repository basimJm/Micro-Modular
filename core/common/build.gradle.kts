plugins {
    `android-library`
    `kotlin-android`
}
apply<ModuleGradlePlugin>()
android {
    namespace = "com.core.common"
}

dependencies {
    compose()
    hilt()
    retrofit()
    moshi()
}