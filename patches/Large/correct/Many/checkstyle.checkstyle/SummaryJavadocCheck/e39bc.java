diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java
index 70dd95d..58de618 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java
@@ -161,7 +161,7 @@
      * @param ast Javadoc root node.
      * @return error string
      */
-    private String getSummarySentence(DetailNode ast) {
+    private static String getSummarySentence(DetailNode ast) {
         boolean flag = true;
         final StringBuilder result = new StringBuilder();
         for (DetailNode child : ast.getChildren()) {
@@ -206,7 +206,7 @@
      * @param detailNode javadoc tag node
      * @return java doc tag content appended in result
      */
-    private String getStringInsideTag(String result, DetailNode detailNode) {
+    private static String getStringInsideTag(String result, DetailNode detailNode) {
         final StringBuilder contents = new StringBuilder(result);
         DetailNode tempNode = detailNode;
         while (tempNode != null) {
