diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/PackageNamesLoaderTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/PackageNamesLoaderTest.java
index fd20277..3afa734 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/PackageNamesLoaderTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/PackageNamesLoaderTest.java
@@ -61,7 +61,7 @@
         validatePackageNames(packageNames);
     }
 
-    private void validatePackageNames(Set<String> pkgNames) {
+    private static void validatePackageNames(Set<String> pkgNames) {
         final String[] checkstylePackages = {
             "com.puppycrawl.tools.checkstyle.",
             "com.puppycrawl.tools.checkstyle.checks.",
