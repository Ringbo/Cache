diff --git a/modules/sdk/gradle-plugins-wsdl-builder/src/main/java/com/liferay/gradle/plugins/wsdl/builder/WSDLBuilderPlugin.java b/modules/sdk/gradle-plugins-wsdl-builder/src/main/java/com/liferay/gradle/plugins/wsdl/builder/WSDLBuilderPlugin.java
index cc69925..12986a9 100644
--- a/modules/sdk/gradle-plugins-wsdl-builder/src/main/java/com/liferay/gradle/plugins/wsdl/builder/WSDLBuilderPlugin.java
+++ b/modules/sdk/gradle-plugins-wsdl-builder/src/main/java/com/liferay/gradle/plugins/wsdl/builder/WSDLBuilderPlugin.java
@@ -233,7 +233,7 @@
 		return javaExec;
 	}
 
-	protected Task addTaskBuildWSDLJar(
+	protected Jar addTaskBuildWSDLJar(
 		BuildWSDLTask buildWSDLTask, File inputFile, Task compileTask,
 		final Task generateTask) {
 
@@ -289,14 +289,14 @@
 				buildWSDLTask, wsdlBuilderConfiguration, inputFile, tmpDir,
 				generateTask);
 
-			Task jarTask = addTaskBuildWSDLJar(
+			Jar jar = addTaskBuildWSDLJar(
 				buildWSDLTask, inputFile, compileTask, generateTask);
 
-			buildWSDLTask.dependsOn(jarTask);
+			buildWSDLTask.dependsOn(jar);
 
 			TaskOutputs taskOutputs = buildWSDLTask.getOutputs();
 
-			taskOutputs.file(jarTask.getOutputs());
+			taskOutputs.file(jar.getArchivePath());
 		}
 		else {
 			Task generateTask = addTaskBuildWSDLGenerate(
