diff --git a/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/util/GradleUtil.java b/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/util/GradleUtil.java
index abf21bc..bccd22d 100644
--- a/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/util/GradleUtil.java
+++ b/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/util/GradleUtil.java
@@ -271,7 +271,9 @@
 
 		List<String> taskNames = startParameter.getTaskNames();
 
-		if (taskNames.contains(taskName)) {
+		if (taskNames.contains(taskName) ||
+			taskNames.contains(project.getPath() + ":" + taskName)) {
+
 			return true;
 		}
 
