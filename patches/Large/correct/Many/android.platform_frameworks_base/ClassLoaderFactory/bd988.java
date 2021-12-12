diff --git a/core/java/com/android/internal/os/ClassLoaderFactory.java b/core/java/com/android/internal/os/ClassLoaderFactory.java
index 0df420b..b2b769e 100644
--- a/core/java/com/android/internal/os/ClassLoaderFactory.java
+++ b/core/java/com/android/internal/os/ClassLoaderFactory.java
@@ -71,7 +71,7 @@
             String librarySearchPath, ClassLoader parent, String classloaderName) {
         if (isPathClassLoaderName(classloaderName)) {
             return new PathClassLoader(dexPath, librarySearchPath, parent);
-        } else if (isPathClassLoaderName(classloaderName)) {
+        } else if (isDelegateLastClassLoaderName(classloaderName)) {
             return new DelegateLastClassLoader(dexPath, librarySearchPath, parent);
         }
 
