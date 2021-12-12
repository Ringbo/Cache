diff --git a/src/com/google/javascript/jscomp/PolymerPass.java b/src/com/google/javascript/jscomp/PolymerPass.java
index 4637053..11d18a2 100644
--- a/src/com/google/javascript/jscomp/PolymerPass.java
+++ b/src/com/google/javascript/jscomp/PolymerPass.java
@@ -606,7 +606,7 @@
     addInterfaceExterns(cls, readOnlyProps);
     removePropertyDocs(objLit);
 
-    block.useSourceInfoFromForTree(exprRoot);
+    block.useSourceInfoIfMissingFromForTree(exprRoot);
     Node stmts = block.removeChildren();
     Node parent = exprRoot.getParent();
 
