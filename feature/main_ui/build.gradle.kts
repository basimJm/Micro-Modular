plugins {
    `android-library`
    `kotlin-android`
}
apply<ModuleGradlePlugin>()

android {
    namespace = "com.feature.main_ui"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    compose()
    hilt()
    retrofit()
    moshi()
}