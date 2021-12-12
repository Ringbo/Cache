diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
index 878d587..95c09a3 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
@@ -143,7 +143,7 @@
      * @throws CheckstyleException if an error occurs.
      */
     static PkgControl load(final URI uri) throws CheckstyleException {
-        InputStream inputStream;
+        final InputStream inputStream;
         try {
             inputStream = uri.toURL().openStream();
         }
