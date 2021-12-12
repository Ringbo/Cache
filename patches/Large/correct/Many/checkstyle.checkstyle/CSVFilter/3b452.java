diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
index 8a36333..2f66e40 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
@@ -47,7 +47,7 @@
      * @throws NumberFormatException if a component substring does not
      * contain a parsable integer.
      */
-    public CSVFilter(String pattern) {
+    CSVFilter(String pattern) {
         final StringTokenizer tokenizer = new StringTokenizer(pattern, ",");
         while (tokenizer.hasMoreTokens()) {
             final String token = tokenizer.nextToken().trim();
