diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
index e2c9631..4c5cf4e 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
@@ -97,7 +97,7 @@
      * @return the full name of the current package.
      */
     private String getPackageName() {
-        final StringBuilder buf = new StringBuilder();
+        final StringBuilder buf = new StringBuilder(256);
         final Iterator<String> iterator = packageStack.descendingIterator();
         while (iterator.hasNext()) {
             final String subPackage = iterator.next();
