diff --git a/src/org/mockito/internal/configuration/ClassPathLoader.java b/src/org/mockito/internal/configuration/ClassPathLoader.java
index 104f7e0..526f9ed 100644
--- a/src/org/mockito/internal/configuration/ClassPathLoader.java
+++ b/src/org/mockito/internal/configuration/ClassPathLoader.java
@@ -143,7 +143,7 @@
         return result;
     }
 
-    private static List<String> readerToLines(Reader reader) throws IOException {
+    static List<String> readerToLines(Reader reader) throws IOException {
         List<String> result = new ArrayList<String>();
         BufferedReader lineReader = new BufferedReader(reader);
         String line;
@@ -153,7 +153,7 @@
         return result;
     }
 
-    private static String stripCommentAndWhitespace(String line) {
+    static String stripCommentAndWhitespace(String line) {
         int hash = line.indexOf('#');
         if (hash != -1) {
             line = line.substring(0, hash);
