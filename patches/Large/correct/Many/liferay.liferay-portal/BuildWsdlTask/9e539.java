diff --git a/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/BuildWsdlTask.java b/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/BuildWsdlTask.java
index 6622805..c26afa3 100644
--- a/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/BuildWsdlTask.java
+++ b/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/BuildWsdlTask.java
@@ -141,7 +141,7 @@
 			_project, _CONFIGURATION_NAME, "javax.mail", "mail", "1.4");
 	}
 
-	protected JavaCompile createTaskCompile(
+	protected Task createTaskCompile(
 		File wsdlFile, File tmpDir, Task generateTask) {
 
 		String taskName = GradleUtil.getTaskName(
@@ -161,7 +161,7 @@
 		return javaCompile;
 	}
 
-	protected JavaExec createTaskGenerate(File wsdlFile, File tmpDir) {
+	protected Task createTaskGenerate(File wsdlFile, File tmpDir) {
 		String taskName = GradleUtil.getTaskName(
 			LiferayJavaPlugin.BUILD_WSDL_TASK_NAME + "Generate", wsdlFile);
 
@@ -187,7 +187,7 @@
 		return javaExec;
 	}
 
-	protected Jar createTaskJar(
+	protected Task createTaskJar(
 		File wsdlFile, Task compileTask, Task generateTask) {
 
 		String taskName = GradleUtil.getTaskName(
