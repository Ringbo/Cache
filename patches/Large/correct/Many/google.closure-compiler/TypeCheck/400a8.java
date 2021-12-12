diff --git a/src/com/google/javascript/jscomp/TypeCheck.java b/src/com/google/javascript/jscomp/TypeCheck.java
index 33782e9..6c5d971 100644
--- a/src/com/google/javascript/jscomp/TypeCheck.java
+++ b/src/com/google/javascript/jscomp/TypeCheck.java
@@ -1559,7 +1559,8 @@
 
       boolean isExtern = false;
       JSDocInfo functionJSDocInfo = functionType.getJSDocInfo();
-      if(functionJSDocInfo != null) {
+      if( functionJSDocInfo != null  &&
+          functionJSDocInfo.getAssociatedNode() != null) {
         isExtern = functionJSDocInfo.getAssociatedNode().isFromExterns();
       }
 
