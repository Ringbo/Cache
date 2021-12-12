diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
index 7941730..414550b 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
@@ -132,7 +132,7 @@
     public static Set<String> getPackageNames(ClassLoader classLoader)
             throws CheckstyleException {
 
-        Set<String> result;
+        final Set<String> result;
         try {
             //create the loader outside the loop to prevent PackageObjectFactory
             //being created anew for each file
