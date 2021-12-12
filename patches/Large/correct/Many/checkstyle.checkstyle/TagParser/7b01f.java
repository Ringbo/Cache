diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/TagParser.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/TagParser.java
index 074a6bc..ce47892 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/TagParser.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/TagParser.java
@@ -54,7 +54,7 @@
      * @param text the line of text to parse.
      * @param lineNo the source line number.
      */
-    public TagParser(String[] text, int lineNo) {
+    TagParser(String[] text, int lineNo) {
         parseTags(text, lineNo);
     }
 
@@ -277,7 +277,7 @@
          * @param lineNo line number
          * @param columnNo column number
          */
-        public Point(int lineNo, int columnNo) {
+        Point(int lineNo, int columnNo) {
             line = lineNo;
             column = columnNo;
         }
