diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java b/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java
index 5ef6007..a941a17 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/PackageObjectFactory.java
@@ -36,7 +36,7 @@
  * @author Rick Giles
  * @author lkuehne
  */
-class PackageObjectFactory implements ModuleFactory {
+public class PackageObjectFactory implements ModuleFactory {
     /** Logger for PackageObjectFactory. */
     private static final Log LOG = LogFactory.getLog(PackageObjectFactory.class);
 
@@ -59,7 +59,7 @@
      * @param moduleClassLoader class loader used to load Checkstyle
      *          core and custom modules
      */
-    PackageObjectFactory(Set<String> packageNames,
+    public PackageObjectFactory(Set<String> packageNames,
             ClassLoader moduleClassLoader) {
         if (moduleClassLoader == null) {
             throw new IllegalArgumentException(
