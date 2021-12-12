diff --git a/portal-impl/src/com/liferay/portal/backgroundtask/messaging/BackgroundTaskQueuingMessageListener.java b/portal-impl/src/com/liferay/portal/backgroundtask/messaging/BackgroundTaskQueuingMessageListener.java
index 90ee2f5..c851cbe 100644
--- a/portal-impl/src/com/liferay/portal/backgroundtask/messaging/BackgroundTaskQueuingMessageListener.java
+++ b/portal-impl/src/com/liferay/portal/backgroundtask/messaging/BackgroundTaskQueuingMessageListener.java
@@ -63,7 +63,7 @@
 			_backgroundTaskLocalService.fetchFirstBackgroundTask(
 				taskExecutorClassName, BackgroundTaskConstants.STATUS_QUEUED);
 
-		if (backgroundTask != null) {
+		if (backgroundTask == null) {
 			return;
 		}
 
