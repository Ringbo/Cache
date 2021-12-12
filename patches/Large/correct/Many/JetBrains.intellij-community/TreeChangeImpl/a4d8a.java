diff --git a/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java b/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java
index eac23a0..ef2cb77 100644
--- a/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java
+++ b/source/com/intellij/pom/tree/events/impl/TreeChangeImpl.java
@@ -121,7 +121,7 @@
   private boolean isAfter(final ASTNode operand, final ASTNode base) {
     ASTNode current = base.getTreeNext();
 
-    while(current != null){
+    while(current != null && current.getTextLength() == 0){
       if(current == operand) return true;
       current = current.getTreeNext();
     }
