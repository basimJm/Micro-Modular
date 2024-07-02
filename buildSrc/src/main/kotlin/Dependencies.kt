import Dependencies.hiltAndroid
import Dependencies.hiltCompliler
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

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

    // hilt
    const val hiltNavigationFragment = "androidx.hilt:hilt-navigation-fragment:1.0.0"
    const val hiltAndroid = "com.google.dagger:hilt-android:2.44"
    const val hiltCompliler = "com.google.dagger:hilt-android-compiler:2.44"

    // compose viewmodel
    const val comnposeLifeCycle =
        "androidx.lifecycle:lifecycle-runtime-compose:${Version.lifecycleRuntimeKtx}"
    const val viewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.lifecycleRuntimeKtx}"

    // navigation compose
    const val hiltNavigationCompose =
        "androidx.navigation:navigation-compose:${Version.hiltNavigationCompose}"
    const val navigationCompose =
        "androidx.navigation:navigation-compose:${Version.navigationCompose}"

    //coil
    const val coil = "io.coil-kt:coil-compose:${Version.coilCompose}"

    //retrofit
    const val retrofitCompose = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"

    //Moshi
    const val moshi = "com.squareup.moshi:moshi:${Version.moshiKotlin}"
    const val moshKotlin = "com.squareup.moshi:moshi-kotlin:${Version.moshiKotlin}"
}

fun DependencyHandler.appModules() {
    implementation(project(":feature:movie:data"))
    implementation(project(":feature:movie:ui"))
    implementation(project(":feature:movie:domain"))

    implementation(project(":feature:movie_details:data"))
    implementation(project(":feature:movie_details:domain"))
    implementation(project(":feature:movie_details:ui"))

    implementation(project(":core:data"))
    implementation(project(":core:common"))
}

fun DependencyHandler.moshi() {
    implementation(Dependencies.moshKotlin)
    implementation(Dependencies.moshi)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofitCompose)
    implementation(Dependencies.retrofitMoshi)
}

fun DependencyHandler.coil() {
    implementation(Dependencies.coil)
}

fun DependencyHandler.navigation() {
    implementation(Dependencies.hiltNavigationCompose)
    implementation(Dependencies.navigationCompose)
}

fun DependencyHandler.viewModel() {
    implementation(Dependencies.comnposeLifeCycle)
    implementation(Dependencies.viewModel)
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


