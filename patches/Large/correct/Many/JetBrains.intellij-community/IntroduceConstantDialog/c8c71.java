diff --git a/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceConstantDialog.java b/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceConstantDialog.java
index 7c779e9..4cc307c 100644
--- a/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceConstantDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/introduceField/IntroduceConstantDialog.java
@@ -434,7 +434,7 @@
   }
 
   public JComponent getPreferredFocusedComponent() {
-    return myNameField.getComponent();
+    return myNameField.getFocusableComponent();
   }
 
   private class ChooseClassAction implements ActionListener {
