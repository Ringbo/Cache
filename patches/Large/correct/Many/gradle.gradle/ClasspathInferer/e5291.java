diff --git a/subprojects/launcher/src/main/java/org/gradle/tooling/internal/provider/ClasspathInferer.java b/subprojects/launcher/src/main/java/org/gradle/tooling/internal/provider/ClasspathInferer.java
index f917376..4ce8f73 100644
--- a/subprojects/launcher/src/main/java/org/gradle/tooling/internal/provider/ClasspathInferer.java
+++ b/subprojects/launcher/src/main/java/org/gradle/tooling/internal/provider/ClasspathInferer.java
@@ -69,7 +69,8 @@
      */
     private void find(Class<?> target, Collection<Class<?>> visited, Collection<URL> dest) {
         ClassLoader targetClassLoader = target.getClassLoader();
-        if (targetClassLoader == null) {
+        if (targetClassLoader == null ||
+            targetClassLoader.getClass().getName().equals("jdk.internal.loader.ClassLoaders$PlatformClassLoader")) { // At some point we probably want to build the modulepath using this information
             // A system class, skip it
             return;
         }
