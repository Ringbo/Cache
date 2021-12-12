diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/DependencyClassPathProvider.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/DependencyClassPathProvider.java
index 4733ec6..c4b8d88 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/DependencyClassPathProvider.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/DependencyClassPathProvider.java
@@ -49,7 +49,7 @@
             return classpath;
         }
         if (name.equals(GRADLE_TEST_KIT.name())) {
-            return moduleRegistry.getModule("gradle-test-kit").getClasspath();
+            return moduleRegistry.getModule("gradle-test-kit").getImplementationClasspath();
         }
         if (name.equals(LOCAL_GROOVY.name())) {
             return moduleRegistry.getExternalModule("groovy-all").getClasspath();
