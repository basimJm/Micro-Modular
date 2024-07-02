plugins {
    `android-library`
    `kotlin-android`
}

apply<ModuleGradlePlugin>()

android {
    namespace = "com.feature.movie.data"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":feature:movie:domain"))
    compose()
    hilt()
    retrofit()
    moshi()
}