diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/ModifierOrderCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/ModifierOrderCheck.java
index caf4ca0..fd91341 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/ModifierOrderCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/ModifierOrderCheck.java
@@ -138,7 +138,7 @@
      * @return null if the order is correct, otherwise returns the offending
      *     modifier AST.
      */
-    static DetailAST checkOrderSuggestedByJLS(List<DetailAST> modifiers) {
+    private static DetailAST checkOrderSuggestedByJLS(List<DetailAST> modifiers) {
         final Iterator<DetailAST> iterator = modifiers.iterator();
 
         //Speed past all initial annotations
