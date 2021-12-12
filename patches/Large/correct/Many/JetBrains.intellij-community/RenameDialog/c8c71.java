diff --git a/refactoring/impl/com/intellij/refactoring/rename/RenameDialog.java b/refactoring/impl/com/intellij/refactoring/rename/RenameDialog.java
index 8cf4b59..ea09b7d 100644
--- a/refactoring/impl/com/intellij/refactoring/rename/RenameDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/rename/RenameDialog.java
@@ -267,7 +267,7 @@
   }
 
   public JComponent getPreferredFocusedComponent() {
-    return myNameSuggestionsField.getComponent();
+    return myNameSuggestionsField.getFocusableComponent();
   }
 
   protected JComponent createCenterPanel() {
