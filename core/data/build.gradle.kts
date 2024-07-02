plugins {
    `android-library`
    `kotlin-android`
}
apply<MainGradlePlugin>()
android {
    namespace = "com.core.data"
}

dependencies {

    compose()
    hilt()
    retrofit()
    moshi()
}