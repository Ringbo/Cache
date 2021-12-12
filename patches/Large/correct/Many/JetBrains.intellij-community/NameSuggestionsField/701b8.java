diff --git a/refactoring/impl/com/intellij/refactoring/ui/NameSuggestionsField.java b/refactoring/impl/com/intellij/refactoring/ui/NameSuggestionsField.java
index f7ff4aa..773e643e 100644
--- a/refactoring/impl/com/intellij/refactoring/ui/NameSuggestionsField.java
+++ b/refactoring/impl/com/intellij/refactoring/ui/NameSuggestionsField.java
@@ -112,9 +112,9 @@
     return this;
   }
 
-  public Component getFocusableComponent() {
+  public JComponent getFocusableComponent() {
     if(myComponent instanceof JComboBox) {
-      return ((JComboBox) myComponent).getEditor().getEditorComponent();
+      return (JComponent) ((JComboBox) myComponent).getEditor().getEditorComponent();
     } else {
       return myComponent;
     }
