diff --git a/source/com/intellij/openapi/roots/ui/configuration/ModuleLevelConfigurablesEditorProvider.java b/source/com/intellij/openapi/roots/ui/configuration/ModuleLevelConfigurablesEditorProvider.java
index 0bef7fd..3fd5948 100644
--- a/source/com/intellij/openapi/roots/ui/configuration/ModuleLevelConfigurablesEditorProvider.java
+++ b/source/com/intellij/openapi/roots/ui/configuration/ModuleLevelConfigurablesEditorProvider.java
@@ -57,7 +57,7 @@
     for (final Configurable moduleConfigurable : moduleConfigurables) {
       result.add(new ConfigurableWrapper(moduleConfigurable));
     }
-    for(Configurable configurable: Extensions.getExtensions(MODULE_CONFIGURABLES)) {
+    for(Configurable configurable: Extensions.getExtensions(MODULE_CONFIGURABLES, myModule)) {
       result.add(new ConfigurableWrapper(configurable));
     }
 
