diff --git a/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/CompileThemeTask.java b/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/CompileThemeTask.java
index ab29966..03bcd3f 100644
--- a/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/CompileThemeTask.java
+++ b/modules/sdk/gradle-plugins/src/com/liferay/gradle/plugins/tasks/CompileThemeTask.java
@@ -197,7 +197,7 @@
 	protected void copyPortalThemeDir(
 		String theme, final String[] excludes, final String[] includes) {
 
-		final String prefix = + theme + "/";
+		final String prefix = theme + "/";
 
 		final File frontendThemesWebDir = getFrontendThemesWebDir();
 		final File frontendThemesWebFile = getFrontendThemesWebFile();
