diff --git a/common/src/main/java/io/netty/util/internal/JavassistTypeParameterMatcherGenerator.java b/common/src/main/java/io/netty/util/internal/JavassistTypeParameterMatcherGenerator.java
index 1543225..e3614b3 100644
--- a/common/src/main/java/io/netty/util/internal/JavassistTypeParameterMatcherGenerator.java
+++ b/common/src/main/java/io/netty/util/internal/JavassistTypeParameterMatcherGenerator.java
@@ -38,11 +38,11 @@
         classPool.appendClassPath(new ClassClassPath(NoOpTypeParameterMatcher.class));
     }
 
-    public void appendClassPath(ClassPath classpath) {
+    public static void appendClassPath(ClassPath classpath) {
         classPool.appendClassPath(classpath);
     }
 
-    public void appendClassPath(String pathname) throws NotFoundException {
+    public static void appendClassPath(String pathname) throws NotFoundException {
         classPool.appendClassPath(pathname);
     }
 
