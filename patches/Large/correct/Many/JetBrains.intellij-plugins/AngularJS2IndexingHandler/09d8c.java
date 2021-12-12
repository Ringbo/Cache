diff --git a/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java b/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
index a78dce4..2408ac2 100644
--- a/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
+++ b/AngularJS/src/org/angularjs/index/AngularJS2IndexingHandler.java
@@ -42,7 +42,7 @@
     }
     if (ref != null){
       final ASTNode name = ref.getLastChildNode();
-      if (name.getElementType() == JSTokenTypes.IDENTIFIER) {
+      if (name != null && name.getElementType() == JSTokenTypes.IDENTIFIER) {
         final String referencedName = name.getText();
         return computeRestrictions(referencedName) != null;
       }
