diff --git a/platform/util/src/com/intellij/util/ui/FormBuilder.java b/platform/util/src/com/intellij/util/ui/FormBuilder.java
index f5437de..e7065df 100644
--- a/platform/util/src/com/intellij/util/ui/FormBuilder.java
+++ b/platform/util/src/com/intellij/util/ui/FormBuilder.java
@@ -52,15 +52,15 @@
     return new FormBuilder();
   }
 
-  public FormBuilder addLabeledComponent(@Nullable JLabel label, JComponent component) {
+  public FormBuilder addLabeledComponent(@Nullable JComponent label, JComponent component) {
     return addLabeledComponent(label, component, myVerticalGap, false);
   }
 
-  public FormBuilder addLabeledComponent(@Nullable JLabel label, JComponent component, final int topInset) {
+  public FormBuilder addLabeledComponent(@Nullable JComponent label, JComponent component, final int topInset) {
     return addLabeledComponent(label, component, topInset, false);
   }
 
-  public FormBuilder addLabeledComponent(@Nullable JLabel label, JComponent component, boolean labelOnTop) {
+  public FormBuilder addLabeledComponent(@Nullable JComponent label, JComponent component, boolean labelOnTop) {
     return addLabeledComponent(label, component, myVerticalGap, labelOnTop);
   }
 
