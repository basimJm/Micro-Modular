plugins {
    `android-library`
    `kotlin-android`
}
apply<ModuleGradlePlugin>()

android {
    namespace = "com.feature.movie_details.data"
}
dependencies {

    compose()
    hilt()
    retrofit()
    moshi()
}