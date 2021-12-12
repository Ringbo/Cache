diff --git a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
index 3962e95..64a4f5f 100644
--- a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
+++ b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
@@ -1272,7 +1272,7 @@
     }
   }
 
-  protected void validateRestParameterType(JSParameter parameter) {
+  protected void validateRestParameterType(JSParameterListElement parameter) {
     PsiElement typeElement = parameter.getTypeElement();
     if (typeElement != null && !"Array".equals(typeElement.getText())) {
       final Pair<ASTNode, ASTNode> nodesBefore = getNodesBefore(typeElement, JSTokenTypes.COLON);
