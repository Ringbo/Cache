diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/WhitespaceAroundCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/WhitespaceAroundCheck.java
index 6e5aaf2..5699273 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/WhitespaceAroundCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/WhitespaceAroundCheck.java
@@ -431,7 +431,7 @@
      * @param parentType parent
      * @return true if current token in colon of case or default tokens
      */
-    private boolean isColonOfCaseOrDefault(int currentType, int parentType) {
+    private static boolean isColonOfCaseOrDefault(int currentType, int parentType) {
         return currentType == TokenTypes.COLON
                 && (parentType == TokenTypes.LITERAL_DEFAULT
                     || parentType == TokenTypes.LITERAL_CASE);
