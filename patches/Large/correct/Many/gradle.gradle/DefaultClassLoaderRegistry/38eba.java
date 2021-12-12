diff --git a/subprojects/core/src/main/java/org/gradle/initialization/DefaultClassLoaderRegistry.java b/subprojects/core/src/main/java/org/gradle/initialization/DefaultClassLoaderRegistry.java
index 816fb07..7bf6b33 100755
--- a/subprojects/core/src/main/java/org/gradle/initialization/DefaultClassLoaderRegistry.java
+++ b/subprojects/core/src/main/java/org/gradle/initialization/DefaultClassLoaderRegistry.java
@@ -52,7 +52,7 @@
         rootSpec.allowPackage("org.apache.commons.logging");
         rootSpec.allowPackage("org.apache.log4j");
         rootSpec.allowPackage("javax.inject");
-        FilteringClassLoader rootClassLoader = classLoaderFactory.createFilteringClassLoader(classLoader, rootSpec);
+        ClassLoader rootClassLoader = classLoaderFactory.createFilteringClassLoader(classLoader, rootSpec);
         return new CachingClassLoader(rootClassLoader);
     }
 
