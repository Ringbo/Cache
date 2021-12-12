diff --git a/subprojects/base-services/src/main/java/org/gradle/internal/classloader/ClassLoaderFactory.java b/subprojects/base-services/src/main/java/org/gradle/internal/classloader/ClassLoaderFactory.java
index 471cab2..1d9d37d 100644
--- a/subprojects/base-services/src/main/java/org/gradle/internal/classloader/ClassLoaderFactory.java
+++ b/subprojects/base-services/src/main/java/org/gradle/internal/classloader/ClassLoaderFactory.java
@@ -43,7 +43,7 @@
      * @param spec the filtering spec for the classloader
      * @return The ClassLoader
      */
-    FilteringClassLoader createFilteringClassLoader(ClassLoader parent, FilteringClassLoader.Spec spec);
+    ClassLoader createFilteringClassLoader(ClassLoader parent, FilteringClassLoader.Spec spec);
 
     /**
      * Creates a ClassLoader from its spec.
