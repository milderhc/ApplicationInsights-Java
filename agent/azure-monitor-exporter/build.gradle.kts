plugins {
  id("ai.java-conventions")
}

// Adding this step to copy playback test results from session-records to build/classes/java/test. Azure core testing framework follows this directory structure.
sourceSets {
  test {
    output.setResourcesDir("build/classes/java/test")
  }
}

dependencies {
  compileOnly("com.google.auto.service:auto-service")
  annotationProcessor("com.google.auto.service:auto-service")

  compileOnly("com.google.auto.value:auto-value-annotations")
  annotationProcessor("com.google.auto.value:auto-value")

  implementation("com.azure:azure-core")
  implementation("com.azure:azure-identity")

  compileOnly("io.opentelemetry:opentelemetry-sdk")
  compileOnly("io.opentelemetry:opentelemetry-sdk-metrics")
  compileOnly("io.opentelemetry:opentelemetry-sdk-logs")
  compileOnly("io.opentelemetry:opentelemetry-sdk-extension-autoconfigure-spi")

  testImplementation("io.opentelemetry:opentelemetry-sdk")
  testImplementation("io.opentelemetry:opentelemetry-sdk-metrics")
  testImplementation("io.opentelemetry:opentelemetry-sdk-logs")
  testImplementation("io.opentelemetry:opentelemetry-sdk-testing")
  testImplementation("io.opentelemetry:opentelemetry-sdk-extension-autoconfigure-spi")

  testImplementation("org.junit.jupiter:junit-jupiter")
  testImplementation("com.azure:azure-core-test")
  testImplementation("org.assertj:assertj-core")
  testImplementation("org.awaitility:awaitility")
  testImplementation("org.mockito:mockito-core")
  testImplementation("uk.org.webcompere:system-stubs-jupiter:2.0.2")
  testImplementation("io.github.hakky54:logcaptor")

  testImplementation("com.azure:azure-data-appconfiguration:1.4.6")
  testImplementation("com.azure:azure-messaging-eventhubs:5.15.5")
  testImplementation("com.azure:azure-messaging-eventhubs-checkpointstore-blob:1.16.7")

  testImplementation("com.squareup.okio:okio:3.3.0")

  testCompileOnly("com.google.code.findbugs:jsr305")
  testCompileOnly("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
}
