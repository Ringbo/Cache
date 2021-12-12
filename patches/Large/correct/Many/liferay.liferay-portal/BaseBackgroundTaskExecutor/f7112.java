diff --git a/portal-service/src/com/liferay/portal/kernel/backgroundtask/BaseBackgroundTaskExecutor.java b/portal-service/src/com/liferay/portal/kernel/backgroundtask/BaseBackgroundTaskExecutor.java
index 4b22c0e..c3fb3c1 100644
--- a/portal-service/src/com/liferay/portal/kernel/backgroundtask/BaseBackgroundTaskExecutor.java
+++ b/portal-service/src/com/liferay/portal/kernel/backgroundtask/BaseBackgroundTaskExecutor.java
@@ -46,7 +46,7 @@
 
 		long userId = MapUtil.getLong(taskContextMap, "userId");
 
-		if (userId <= 0) {
+		if (userId > 0) {
 			try {
 				User user = UserLocalServiceUtil.getUser(userId);
 
