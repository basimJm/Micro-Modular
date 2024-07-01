import com.android.build.gradle.AppExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

class MainGradlePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        applyPlugins(project)
        setProjectConfig(project)
    }

    private fun applyPlugins(project: Project) {
        project.plugins.apply {
            apply("com.android.application")
            apply("org.jetbrains.kotlin.android")
            apply("dagger.hilt.android.plugin")
            apply("kotlin-kapt")
        }
    }

    private fun setProjectConfig(project: Project) {
        project.extensions.getByType(AppExtension::class.java).apply {
            compileSdkVersion(34)

            defaultConfig {
                applicationId = "com.blackhand.modularbyfeature"
                minSdkVersion(24)
                targetSdkVersion(34)
                versionCode = 1
                versionName = "1.0"
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                vectorDrawables.useSupportLibrary = true
            }

            buildTypes {
                getByName("release") {
                    isMinifyEnabled = false
                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                    )
                }
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
            }


            buildFeatures.compose = true
            composeOptions.kotlinCompilerExtensionVersion = "1.5.1"

            packagingOptions.resources.excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
