diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index 0450a3b..4481b15 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -999,7 +999,8 @@
     AnActionListener.Adapter actionListener = new AnActionListener.Adapter() {
       @Override
       public void beforeActionPerformed(AnAction action, DataContext dataContext, AnActionEvent event) {
-        if (isZeroLatencyTypingEnabled() && IMMEDIATE_EDITING_ACTIONS.contains(action.getClass())) {
+        if (isZeroLatencyTypingEnabled() && IMMEDIATE_EDITING_ACTIONS.contains(action.getClass()) &&
+            !(action.getClass() == PasteAction.class && mySelectionModel.hasSelection())) {
           myImmediateEditingInProgress = true;
         }
       }
