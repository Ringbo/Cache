diff --git a/src/com/google/javascript/jscomp/DeclaredGlobalExternsOnWindow.java b/src/com/google/javascript/jscomp/DeclaredGlobalExternsOnWindow.java
index df44bd2..7a4c2be 100644
--- a/src/com/google/javascript/jscomp/DeclaredGlobalExternsOnWindow.java
+++ b/src/com/google/javascript/jscomp/DeclaredGlobalExternsOnWindow.java
@@ -109,7 +109,7 @@
 
     newNode.useSourceInfoFromForTree(node);
     newNode.setOriginalName(name);
-    newNode.makeNonIndexable();
+    newNode.makeNonIndexableRecursive();
     node.getGrandparent().addChildToBack(IR.exprResult(newNode));
   }
 
