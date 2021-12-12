diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePresentation.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePresentation.java
index c94f6f1..bb3c87b 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePresentation.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePresentation.java
@@ -294,7 +294,7 @@
      * @param column column index.
      * @return value at specified column.
      */
-    private Object getValueAtDetailNode(DetailNode node, int column) {
+    private static Object getValueAtDetailNode(DetailNode node, int column) {
         final Object value;
 
         switch (column) {
@@ -326,7 +326,7 @@
      * @param column column index.
      * @return value at specified column.
      */
-    private Object getValueAtDetailAST(DetailAST ast, int column) {
+    private static Object getValueAtDetailAST(DetailAST ast, int column) {
         final Object value;
 
         switch (column) {
