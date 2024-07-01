import Dependencies.hiltAndroid
import Dependencies.hiltCompliler
import Dependencies.hiltNavigationFragment
import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
    const val composeBom = "androidx.compose:compose-bom:${Version.composeBom}"
    const val composeUi = "androidx.compose.ui:ui"
    const val uiGraphics = "androidx.compose.ui:ui-graphics"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val lifecycleRuntimeKtx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycleRuntimeKtx}"
    const val activityCompose = "androidx.activity:activity-compose:${Version.activityCompose}"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val material3 = "androidx.compose.material3:material3"

    const val androidxJunit = "androidx.test.ext:junit:${Version.junitVersion}"
    const val junit = "junit:junit:${Version.junit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espressoCore}"


    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
    const val hiltNavigationFragment = "androidx.hilt:hilt-navigation-fragment:1.0.0"
    const val hiltAndroid = "com.google.dagger:hilt-android:2.44"
    const val hiltCompliler = "com.google.dagger:hilt-android-compiler:2.44"
    const val hiltGradlePlugin = "com.google.dagger.hilt.android:2.44"
}

fun DependencyHandler.hilt() {
//    implementation(hiltNavigationFragment)
    implementation(hiltAndroid)
    kapt(hiltCompliler)
}

fun DependencyHandler.compose() {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.activityCompose)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.uiGraphics)

    implementation(Dependencies.uiToolingPreview)
    implementation(Dependencies.material3)
    implementation(platform(Dependencies.composeBom))

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.androidxJunit)
    androidTestImplementation(platform(Dependencies.composeBom))
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(Dependencies.uiTestJunit4)
    debugImplementation(Dependencies.uiTooling)
    debugImplementation(Dependencies.uiTestManifest)
}