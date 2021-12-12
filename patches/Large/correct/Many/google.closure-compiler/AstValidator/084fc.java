diff --git a/src/com/google/javascript/jscomp/AstValidator.java b/src/com/google/javascript/jscomp/AstValidator.java
index b0272ef..6d42f08 100644
--- a/src/com/google/javascript/jscomp/AstValidator.java
+++ b/src/com/google/javascript/jscomp/AstValidator.java
@@ -1052,7 +1052,7 @@
     Node caught = n.getFirstChild();
     if (caught.isName()) {
       validateName(caught);
-    } else if (n.isArrayPattern()) {
+    } else if (caught.isArrayPattern()) {
       validateArrayPattern(Token.CATCH, caught);
     } else {
       validateObjectPattern(Token.CATCH, caught);
