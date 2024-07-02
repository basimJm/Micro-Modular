plugins {
    `android-library`
    `kotlin-android`
}
apply<ModuleGradlePlugin>()
android {
    namespace = "com.feature.movie.domain"
}
dependencies {
    compose()
    hilt()
    retrofit()
    moshi()
}