diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java b/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java
index 3bf5f81..1635a6e 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java
@@ -49,7 +49,7 @@
      * @param moduleClassLoader class loader used to load Checkstyle
      *          core and custom modules
      */
-    public PackageObjectFactory(Set<String> packageNames,
+    PackageObjectFactory(Set<String> packageNames,
             ClassLoader moduleClassLoader) {
         if (moduleClassLoader == null) {
             throw new IllegalArgumentException(
