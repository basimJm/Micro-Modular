plugins {
    id("com.android.application")
    id("kotlin-android")

}
apply<MainGradlePlugin>()
android {
    namespace = "com.blackhand.modularbyfeature"

}

dependencies {
    appModules()
    compose()
    hilt()
}
