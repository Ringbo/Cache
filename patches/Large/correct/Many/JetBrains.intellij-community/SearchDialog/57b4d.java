diff --git a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/SearchDialog.java b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/SearchDialog.java
index 146c885..d016828 100644
--- a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/SearchDialog.java
+++ b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/SearchDialog.java
@@ -482,7 +482,7 @@
             setValuesToConfig(model.getConfig());
 
             if (model.getShadowConfig()==null ||
-                model.getConfig() instanceof PredefinedConfiguration
+                model.getShadowConfig() instanceof PredefinedConfiguration
                ) {
               existingTemplatesComponent.addConfigurationToUserTemplates(
                 model.getConfig()
