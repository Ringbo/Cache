diff --git a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/GrailsScriptRunner.java b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/GrailsScriptRunner.java
index d3a6696..0db0321 100644
--- a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/GrailsScriptRunner.java
+++ b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/GrailsScriptRunner.java
@@ -623,7 +623,7 @@
 
         console.updateStatus("Configuring classpath");
         ClasspathConfigurer configurer = new ClasspathConfigurer(pluginPathSupport, settings, skipPlugins);
-        if ("DependencyReport".equals(scriptName) || "Upgrade".equals(scriptName)) {
+        if ("DependencyReport".equals(scriptName) || "Upgrade".equals(scriptName) || "SetProxy".equals(scriptName) || "AddProxy".equals(scriptName)) {
             configurer.setExitOnResolveError(false);
         }
         classLoader = configurer.configuredClassLoader();
