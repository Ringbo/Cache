diff --git a/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinLibraryProjectInitDescriptor.java b/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinLibraryProjectInitDescriptor.java
index 7228232..59bfd8c 100644
--- a/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinLibraryProjectInitDescriptor.java
+++ b/subprojects/build-init/src/main/java/org/gradle/buildinit/plugins/internal/KotlinLibraryProjectInitDescriptor.java
@@ -43,10 +43,10 @@
         BuildScriptBuilder buildScriptBuilder = scriptBuilderFactory.script(settings.getDsl(), "build")
             .fileComment("This generated file contains a sample Kotlin library project to get you started.")
             .plugin("Apply the Kotlin JVM plugin to add support for Kotlin on the JVM", "org.jetbrains.kotlin.jvm", kotlinVersion)
-            .compileDependency("Use the Kotlin standard library", "org.jetbrains.kotlin:kotlin-stdlib")
-            .compileDependency("Use the Kotlin JDK 8 standard library", "org.jetbrains.kotlin:kotlin-stdlib-jdk8")
-            .testCompileDependency("Use the Kotlin test library", "org.jetbrains.kotlin:kotlin-test")
-            .testCompileDependency("Use the Kotlin JUnit integration", "org.jetbrains.kotlin:kotlin-test-junit");
+            .implementationDependency("Use the Kotlin standard library", "org.jetbrains.kotlin:kotlin-stdlib")
+            .implementationDependency("Use the Kotlin JDK 8 standard library", "org.jetbrains.kotlin:kotlin-stdlib-jdk8")
+            .testImplementationDependency("Use the Kotlin test library", "org.jetbrains.kotlin:kotlin-test")
+            .testImplementationDependency("Use the Kotlin JUnit integration", "org.jetbrains.kotlin:kotlin-test-junit");
 
         buildScriptBuilder.create().generate();
 
