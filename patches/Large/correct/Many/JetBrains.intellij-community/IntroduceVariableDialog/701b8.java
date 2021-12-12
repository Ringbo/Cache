diff --git a/refactoring/impl/com/intellij/refactoring/introduceVariable/IntroduceVariableDialog.java b/refactoring/impl/com/intellij/refactoring/introduceVariable/IntroduceVariableDialog.java
index d561ff7..119e645 100644
--- a/refactoring/impl/com/intellij/refactoring/introduceVariable/IntroduceVariableDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/introduceVariable/IntroduceVariableDialog.java
@@ -260,7 +260,7 @@
   }
 
   public JComponent getPreferredFocusedComponent() {
-    return myNameField.getComponent();
+    return myNameField.getFocusableComponent();
   }
 
   protected void doHelpAction() {
