diff --git a/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/AntTargetReference.java b/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/AntTargetReference.java
index d061274..739835d 100644
--- a/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/AntTargetReference.java
+++ b/plugins/ant/src/com/intellij/lang/ant/psi/impl/reference/AntTargetReference.java
@@ -35,7 +35,7 @@
 
   public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
     final AntElement element = getElement();
-    if (element instanceof AntProject || element instanceof AntCall) {
+    if (element instanceof AntProject || element instanceof AntCall || element instanceof AntAnt) {
       getAttribute().setValue(newElementName);
     }
     else if (element instanceof AntTarget) {
