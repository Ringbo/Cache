diff --git a/modules/sdk/gradle-plugins-js-transpiler/src/main/java/com/liferay/gradle/plugins/js/transpiler/TranspileJSTask.java b/modules/sdk/gradle-plugins-js-transpiler/src/main/java/com/liferay/gradle/plugins/js/transpiler/TranspileJSTask.java
index 8d35846..2c84992 100644
--- a/modules/sdk/gradle-plugins-js-transpiler/src/main/java/com/liferay/gradle/plugins/js/transpiler/TranspileJSTask.java
+++ b/modules/sdk/gradle-plugins-js-transpiler/src/main/java/com/liferay/gradle/plugins/js/transpiler/TranspileJSTask.java
@@ -47,7 +47,7 @@
 	}
 
 	@Override
-	public void executeNode() {
+	public void executeNode() throws Exception {
 		final File sourceDir = getSourceDir();
 		final File workingDir = getWorkingDir();
 
