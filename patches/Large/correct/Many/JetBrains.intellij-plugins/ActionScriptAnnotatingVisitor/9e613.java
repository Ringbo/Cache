diff --git a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
index 523aee6..5cfb8a6 100644
--- a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
+++ b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
@@ -607,7 +607,7 @@
     public void invoke(@NotNull final Project project, final Editor editor, final PsiFile file) throws IncorrectOperationException {
       JSAttributeListWrapper w = new JSAttributeListWrapper(myNode.getAttributeList());
       w.overrideModifier(JSAttributeList.ModifierType.OVERRIDE, true);
-      w.applyTo(myNode, myNode.getAttributeList());
+      w.applyTo(myNode);
     }
 
     public boolean startInWriteAction() {
