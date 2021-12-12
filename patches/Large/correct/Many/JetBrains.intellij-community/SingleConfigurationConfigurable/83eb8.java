diff --git a/platform/lang-impl/src/com/intellij/execution/impl/SingleConfigurationConfigurable.java b/platform/lang-impl/src/com/intellij/execution/impl/SingleConfigurationConfigurable.java
index f38e802..8f4df00 100644
--- a/platform/lang-impl/src/com/intellij/execution/impl/SingleConfigurationConfigurable.java
+++ b/platform/lang-impl/src/com/intellij/execution/impl/SingleConfigurationConfigurable.java
@@ -129,7 +129,7 @@
     return myComponent.getWholePanel();
   }
 
-  public final JComponent getValidationComponent() {
+  final JComponent getValidationComponent() {
     return myComponent.myValidationPanel;
   }
 
