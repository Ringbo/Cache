diff --git a/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayDefaultsPlugin.java b/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayDefaultsPlugin.java
index f8799e1..795716c 100644
--- a/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayDefaultsPlugin.java
+++ b/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayDefaultsPlugin.java
@@ -1181,7 +1181,7 @@
 			uploadArchivesTask.finalizedBy(updateBundleVersionTask);
 		}
 
-		uploadArchivesTask.finalizedBy(updateBundleVersionTask);
+		uploadArchivesTask.finalizedBy(updateFileVersionsTask);
 	}
 
 	protected String getBundleInstruction(Project project, String key) {
