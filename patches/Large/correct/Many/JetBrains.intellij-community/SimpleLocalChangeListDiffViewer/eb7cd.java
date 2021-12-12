diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/diff/SimpleLocalChangeListDiffViewer.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/diff/SimpleLocalChangeListDiffViewer.java
index 77a1119..8a7b9d1 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/diff/SimpleLocalChangeListDiffViewer.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/diff/SimpleLocalChangeListDiffViewer.java
@@ -65,7 +65,7 @@
   @NotNull
   @Override
   protected List<AnAction> createEditorPopupActions() {
-    List<AnAction> group = new ArrayList<>(super.createToolbarActions());
+    List<AnAction> group = new ArrayList<>(super.createEditorPopupActions());
 
     group.add(new MoveSelectedChangesToAnotherChangelistAction(false));
 
