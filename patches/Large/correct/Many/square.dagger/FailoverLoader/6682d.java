diff --git a/core/src/main/java/dagger/internal/FailoverLoader.java b/core/src/main/java/dagger/internal/FailoverLoader.java
index 52f923e..4b14af2 100644
--- a/core/src/main/java/dagger/internal/FailoverLoader.java
+++ b/core/src/main/java/dagger/internal/FailoverLoader.java
@@ -51,7 +51,7 @@
           // A null classloader is the system classloader.
           classLoader = (classLoader != null) ? classLoader : ClassLoader.getSystemClassLoader();
           Class<?> type = classLoader.loadClass(className);
-          if (!type.isInterface()) {
+          if (type.isInterface()) {
             return null; // Short-circuit since we can't build reflective bindings for interfaces.
           }
           return ReflectiveAtInjectBinding.create(type, mustHaveInjections);
