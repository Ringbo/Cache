diff --git a/modules/sdk/gradle-plugins-soy/src/main/java/com/liferay/gradle/plugins/soy/tasks/ReplaceSoyTranslationTask.java b/modules/sdk/gradle-plugins-soy/src/main/java/com/liferay/gradle/plugins/soy/tasks/ReplaceSoyTranslationTask.java
index 40cd865..fc44a79 100644
--- a/modules/sdk/gradle-plugins-soy/src/main/java/com/liferay/gradle/plugins/soy/tasks/ReplaceSoyTranslationTask.java
+++ b/modules/sdk/gradle-plugins-soy/src/main/java/com/liferay/gradle/plugins/soy/tasks/ReplaceSoyTranslationTask.java
@@ -40,7 +40,7 @@
 	@TaskAction
 	public void replaceSoyTranslation() throws IOException {
 		for (File file : getSource()) {
-			_replaceTranslationCommand.replaceTranslation(file.toPath());
+			_replaceTranslationCommand.execute(file.toPath());
 		}
 	}
 
