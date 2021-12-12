diff --git a/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceFieldDialog.java b/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceFieldDialog.java
index fa0b0d4..64302b4 100644
--- a/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceFieldDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceFieldDialog.java
@@ -542,7 +542,7 @@
   }
 
   public JComponent getPreferredFocusedComponent() {
-    return myNameField.getComponent();
+    return myNameField.getFocusableComponent();
   }
 
   protected void doHelpAction() {
