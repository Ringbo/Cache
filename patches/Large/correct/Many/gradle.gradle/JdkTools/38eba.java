diff --git a/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JdkTools.java b/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JdkTools.java
index cb54009..c8df422 100644
--- a/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JdkTools.java
+++ b/subprojects/language-java/src/main/java/org/gradle/api/internal/tasks/compile/JdkTools.java
@@ -57,7 +57,7 @@
         DefaultClassLoaderFactory defaultClassLoaderFactory = new DefaultClassLoaderFactory();
         JavaVersion javaVersion = Jvm.current().getJavaVersion();
         boolean java9Compatible = javaVersion.isJava9Compatible();
-        FilteringClassLoader filteringClassLoader = getSystemFilteringClassLoader(defaultClassLoaderFactory, java9Compatible);
+        ClassLoader filteringClassLoader = getSystemFilteringClassLoader(defaultClassLoaderFactory, java9Compatible);
         if (!java9Compatible) {
             File toolsJar = javaInfo.getToolsJar();
             if (toolsJar == null) {
@@ -74,7 +74,7 @@
         }
     }
 
-    private FilteringClassLoader getSystemFilteringClassLoader(DefaultClassLoaderFactory defaultClassLoaderFactory, boolean java9compatible) {
+    private ClassLoader getSystemFilteringClassLoader(DefaultClassLoaderFactory defaultClassLoaderFactory, boolean java9compatible) {
         FilteringClassLoader.Spec filterSpec = new FilteringClassLoader.Spec();
         if (java9compatible) {
             filterSpec.allowPackage("com.sun.tools");
