diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java b/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java
index b550a76..d04c75b 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/api/FileText.java
@@ -172,7 +172,7 @@
      * @throws NullPointerException if the lines array is null
      */
     public FileText(File file, List<String> lines) {
-        final StringBuilder buf = new StringBuilder();
+        final StringBuilder buf = new StringBuilder(1024);
         for (final String line : lines) {
             buf.append(line).append('\n');
         }
@@ -195,7 +195,7 @@
         if (!inputFile.exists()) {
             throw new FileNotFoundException(inputFile.getPath() + " (No such file or directory)");
         }
-        final StringBuilder buf = new StringBuilder();
+        final StringBuilder buf = new StringBuilder(1024);
         final FileInputStream stream = new FileInputStream(inputFile);
         final Reader reader = new InputStreamReader(stream, decoder);
         try {
