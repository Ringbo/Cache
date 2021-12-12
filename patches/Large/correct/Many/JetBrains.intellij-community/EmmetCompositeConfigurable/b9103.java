diff --git a/xml/impl/src/com/intellij/application/options/emmet/EmmetCompositeConfigurable.java b/xml/impl/src/com/intellij/application/options/emmet/EmmetCompositeConfigurable.java
index f787454..f16e7fa 100644
--- a/xml/impl/src/com/intellij/application/options/emmet/EmmetCompositeConfigurable.java
+++ b/xml/impl/src/com/intellij/application/options/emmet/EmmetCompositeConfigurable.java
@@ -98,7 +98,7 @@
   public void apply() throws ConfigurationException {
     EmmetOptions.getInstance().setEmmetExpandShortcut(myTemplateExpandShortcutPanel.getSelectedChar());
     for (Configurable configurable : myInnerConfigurables) {
-      configurable.reset();
+      configurable.apply();
     }
     super.apply();
   }
