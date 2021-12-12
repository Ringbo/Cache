diff --git a/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinApplicationProjectInitDescriptor.java b/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinApplicationProjectInitDescriptor.java
index 4022245..aa6e123 100644
--- a/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinApplicationProjectInitDescriptor.java
+++ b/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinApplicationProjectInitDescriptor.java
@@ -44,10 +44,10 @@
             .fileComment("This generated file contains a sample Kotlin application project to get you started.")
             .plugin("Apply the Kotlin JVM plugin to add support for Kotlin on the JVM", "org.jetbrains.kotlin.jvm", kotlinVersion)
             .plugin("Apply the application to add support for building a CLI application", "application")
-            .compileDependency("Use the Kotlin standard library", "org.jetbrains.kotlin:kotlin-stdlib")
-            .compileDependency("Use the Kotlin JDK 8 standard library", "org.jetbrains.kotlin:kotlin-stdlib-jdk8")
-            .testCompileDependency("Use the Kotlin test library", "org.jetbrains.kotlin:kotlin-test")
-            .testCompileDependency("Use the Kotlin JUnit integration", "org.jetbrains.kotlin:kotlin-test-junit")
+            .implementationDependency("Use the Kotlin standard library", "org.jetbrains.kotlin:kotlin-stdlib")
+            .implementationDependency("Use the Kotlin JDK 8 standard library", "org.jetbrains.kotlin:kotlin-stdlib-jdk8")
+            .testImplementationDependency("Use the Kotlin test library", "org.jetbrains.kotlin:kotlin-test")
+            .testImplementationDependency("Use the Kotlin JUnit integration", "org.jetbrains.kotlin:kotlin-test-junit")
             .conventionPropertyAssignment(
                 "Define the main class for the application",
                 "application", "mainClassName", withPackage(settings, "AppKt"));
