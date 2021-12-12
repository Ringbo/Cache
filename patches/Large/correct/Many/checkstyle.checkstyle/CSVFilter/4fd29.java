diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
index bb3e3a8..78bf806 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
@@ -46,8 +46,7 @@
      * @throws NumberFormatException if a component substring does not
      * contain a parsable integer.
      */
-    public CSVFilter(String pattern)
-        throws NumberFormatException {
+    public CSVFilter(String pattern) {
         final StringTokenizer tokenizer = new StringTokenizer(pattern, ",");
         while (tokenizer.hasMoreTokens()) {
             final String token = tokenizer.nextToken().trim();
