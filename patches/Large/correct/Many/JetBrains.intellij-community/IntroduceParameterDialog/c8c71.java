diff --git a/refactoring/impl/com/intellij/refactoring/introduceParameter/IntroduceParameterDialog.java b/refactoring/impl/com/intellij/refactoring/introduceParameter/IntroduceParameterDialog.java
index 14d53a7..ba08d3b 100644
--- a/refactoring/impl/com/intellij/refactoring/introduceParameter/IntroduceParameterDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/introduceParameter/IntroduceParameterDialog.java
@@ -146,7 +146,7 @@
   }
 
   public JComponent getPreferredFocusedComponent() {
-    return myParameterNameField.getComponent();
+    return myParameterNameField.getFocusableComponent();
   }
 
   private PsiType getSelectedType() {
