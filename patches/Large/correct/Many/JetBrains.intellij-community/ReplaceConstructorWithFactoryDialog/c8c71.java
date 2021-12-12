diff --git a/refactoring/impl/com/intellij/refactoring/replaceConstructorWithFactory/ReplaceConstructorWithFactoryDialog.java b/refactoring/impl/com/intellij/refactoring/replaceConstructorWithFactory/ReplaceConstructorWithFactoryDialog.java
index e733ef8..109b871 100644
--- a/refactoring/impl/com/intellij/refactoring/replaceConstructorWithFactory/ReplaceConstructorWithFactoryDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/replaceConstructorWithFactory/ReplaceConstructorWithFactoryDialog.java
@@ -56,7 +56,7 @@
   }
 
   public JComponent getPreferredFocusedComponent() {
-    return myNameField.getComponent();
+    return myNameField.getFocusableComponent();
   }
 
   public String getTargetClassName() {
