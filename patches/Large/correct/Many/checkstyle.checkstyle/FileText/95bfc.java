diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java b/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java
index 26c49fc..a9c91ae 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java
@@ -190,7 +190,7 @@
      * @return File's text
      * @throws IOException Unable to open or read the file
      */
-    private String readFile(final File inputFile, final CharsetDecoder decoder)
+    private static String readFile(final File inputFile, final CharsetDecoder decoder)
             throws IOException {
         final StringBuilder buf = new StringBuilder();
         final FileInputStream stream = new FileInputStream(inputFile);
