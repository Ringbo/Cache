diff --git a/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/LiferayCIPlugin.java b/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/LiferayCIPlugin.java
index 79640f4..7a20406 100644
--- a/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/LiferayCIPlugin.java
+++ b/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/internal/LiferayCIPlugin.java
@@ -88,7 +88,7 @@
 	private void _configureTaskExecuteNodeArgs(
 		ExecuteNodeTask executeNodeTask, Map<String, String> newArgs) {
 
-		List<String> args = executeNodeTask.getArgs();
+		List<Object> args = executeNodeTask.getArgs();
 
 		for (Map.Entry<String, String> entry : newArgs.entrySet()) {
 			String key = entry.getKey();
@@ -97,7 +97,7 @@
 			boolean changed = false;
 
 			for (int i = 0; i < args.size(); i++) {
-				String arg = args.get(i);
+				String arg = GradleUtil.toString(args.get(i));
 
 				if (arg.startsWith(key)) {
 					changed = true;
