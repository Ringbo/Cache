diff --git a/modules/sdk/gradle-plugins-wedeploy/src/main/java/com/liferay/gradle/plugins/wedeploy/WeDeploySettingsPlugin.java b/modules/sdk/gradle-plugins-wedeploy/src/main/java/com/liferay/gradle/plugins/wedeploy/WeDeploySettingsPlugin.java
index 3610a4a..20c2a36 100644
--- a/modules/sdk/gradle-plugins-wedeploy/src/main/java/com/liferay/gradle/plugins/wedeploy/WeDeploySettingsPlugin.java
+++ b/modules/sdk/gradle-plugins-wedeploy/src/main/java/com/liferay/gradle/plugins/wedeploy/WeDeploySettingsPlugin.java
@@ -155,14 +155,14 @@
 							settings, dirPath, rootDirPath, projectPathPrefix);
 
 						projectPathPluginClasses.put(
-							projectPath, WeDeployDataPlugin.class);
+							projectPath, DataWeDeployPlugin.class);
 					}
 					else if (wedeployJSON.contains("wedeploy/message-queue")) {
 						String projectPath = _includeProject(
 							settings, dirPath, rootDirPath, projectPathPrefix);
 
 						projectPathPluginClasses.put(
-							projectPath, WeDeployMessageQueuePlugin.class);
+							projectPath, MessageQueueWeDeployPlugin.class);
 					}
 
 					return FileVisitResult.SKIP_SUBTREE;
