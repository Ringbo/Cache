diff --git a/subprojects/base-services/src/main/java/org/gradle/internal/classloader/DefaultClassLoaderFactory.java b/subprojects/base-services/src/main/java/org/gradle/internal/classloader/DefaultClassLoaderFactory.java
index ef04de0..139517d 100644
--- a/subprojects/base-services/src/main/java/org/gradle/internal/classloader/DefaultClassLoaderFactory.java
+++ b/subprojects/base-services/src/main/java/org/gradle/internal/classloader/DefaultClassLoaderFactory.java
@@ -80,7 +80,7 @@
     }
 
     @Override
-    public FilteringClassLoader createFilteringClassLoader(ClassLoader parent, FilteringClassLoader.Spec spec) {
+    public ClassLoader createFilteringClassLoader(ClassLoader parent, FilteringClassLoader.Spec spec) {
         // See the comment for {@link #createIsolatedClassLoader} above
         FilteringClassLoader.Spec classLoaderSpec = new FilteringClassLoader.Spec(spec);
         if (needJaxpImpl()) {
