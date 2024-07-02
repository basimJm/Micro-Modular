plugins {
    `android-library`
    `kotlin-android`
}

apply<ModuleGradlePlugin>()

android {
    namespace = "com.core.data"
}

dependencies {
    implementation(project(":feature:movie:data"))
    compose()
    hilt()
    retrofit()
    moshi()
}
