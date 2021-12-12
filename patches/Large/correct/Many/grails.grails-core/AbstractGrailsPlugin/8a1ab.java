diff --git a/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPlugin.java b/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPlugin.java
index 4ce4d4f..fecf5a9 100644
--- a/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPlugin.java
+++ b/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPlugin.java
@@ -93,7 +93,7 @@
             try {
                 if (filename.equals(PLUGIN_YML)) {
                     YamlPropertySourceLoader propertySourceLoader = new YamlPropertySourceLoader();
-                    this.propertySource = propertySourceLoader.load(GrailsNameUtils.getLogicalPropertyName(pluginClass.getSimpleName(), "GrailsPlugin") + "-" + PLUGIN_YML, resource, null, true, DEFAULT_CONFIG_IGNORE_LIST);
+                    this.propertySource = propertySourceLoader.load(GrailsNameUtils.getLogicalPropertyName(pluginClass.getSimpleName(), "GrailsPlugin") + "-" + PLUGIN_YML, resource, null, false, DEFAULT_CONFIG_IGNORE_LIST);
                 } else if (filename.equals(PLUGIN_GROOVY)) {
                     GroovyConfigPropertySourceLoader propertySourceLoader = new GroovyConfigPropertySourceLoader();
                     this.propertySource = propertySourceLoader.load(GrailsNameUtils.getLogicalPropertyName(pluginClass.getSimpleName(), "GrailsPlugin") + "-" + PLUGIN_GROOVY, resource, null, DEFAULT_CONFIG_IGNORE_LIST);
