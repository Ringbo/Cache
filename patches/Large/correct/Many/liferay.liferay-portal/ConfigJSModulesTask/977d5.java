diff --git a/modules/sdk/gradle-plugins-js-module-config-generator/src/main/java/com/liferay/gradle/plugins/js/module/config/generator/ConfigJSModulesTask.java b/modules/sdk/gradle-plugins-js-module-config-generator/src/main/java/com/liferay/gradle/plugins/js/module/config/generator/ConfigJSModulesTask.java
index fc8a89e..01762d7 100644
--- a/modules/sdk/gradle-plugins-js-module-config-generator/src/main/java/com/liferay/gradle/plugins/js/module/config/generator/ConfigJSModulesTask.java
+++ b/modules/sdk/gradle-plugins-js-module-config-generator/src/main/java/com/liferay/gradle/plugins/js/module/config/generator/ConfigJSModulesTask.java
@@ -83,7 +83,7 @@
 	}
 
 	@Override
-	public void executeNode() {
+	public void executeNode() throws Exception {
 		Project project = getProject();
 
 		final File outputDir = getOutputDir();
