diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java
index 58de618..1e78b89 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/SummaryJavadocCheck.java
@@ -163,7 +163,7 @@
      */
     private static String getSummarySentence(DetailNode ast) {
         boolean flag = true;
-        final StringBuilder result = new StringBuilder();
+        final StringBuilder result = new StringBuilder(256);
         for (DetailNode child : ast.getChildren()) {
             if (ALLOWED_TYPES.contains(child.getType())) {
                 result.append(child.getText());
@@ -193,7 +193,7 @@
      * @return content of child nodes as string.
      */
     private static String getContentOfChild(DetailNode child) {
-        final StringBuilder contents = new StringBuilder();
+        final StringBuilder contents = new StringBuilder(256);
         for (DetailNode node : child.getChildren()) {
             contents.append(node.getText().trim());
         }
@@ -224,7 +224,7 @@
      * @return first sentence.
      */
     private static String getFirstSentence(DetailNode ast) {
-        final StringBuilder result = new StringBuilder();
+        final StringBuilder result = new StringBuilder(256);
         final String periodSuffix = PERIOD + ' ';
         for (DetailNode child : ast.getChildren()) {
             final String text;
