plugins {
    id 'com.android.library' // Usa 'com.android.application' se è un'applicazione e non una libreria
    id 'kotlin-android'
}

android {
    compileSdkVersion 30
    defaultConfig {
        minSdkVersion 21
        targetSdkVersion 30
    }
}

dependencies {
    implementation 'org.jetbrains.kotlin:kotlin-stdlib:1.5.21' // Versione di Kotlin, assicurati che corrisponda alla tua
    implementation "com.lagradost.cloudstream3:cloudstream3:VERSION" // Versione di Cloudstream, sostituisci con la versione che stai utilizzando
    // Aggiungi altre dipendenze se necessario
}


task<Delete>("clean") {
    delete(rootProject.buildDir)
}
