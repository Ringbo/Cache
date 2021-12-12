diff --git a/portlets/push-notifications-portlet/docroot/WEB-INF/src/com/liferay/pushnotifications/service/impl/PushNotificationsDeviceLocalServiceImpl.java b/portlets/push-notifications-portlet/docroot/WEB-INF/src/com/liferay/pushnotifications/service/impl/PushNotificationsDeviceLocalServiceImpl.java
index 1f07531..1ef06ec 100644
--- a/portlets/push-notifications-portlet/docroot/WEB-INF/src/com/liferay/pushnotifications/service/impl/PushNotificationsDeviceLocalServiceImpl.java
+++ b/portlets/push-notifications-portlet/docroot/WEB-INF/src/com/liferay/pushnotifications/service/impl/PushNotificationsDeviceLocalServiceImpl.java
@@ -76,7 +76,7 @@
 
 			PushNotificationsSender pushNotificationsSender = entry.getValue();
 
-			pushNotificationsSender.resetPushNotificationSenders();
+			pushNotificationsSender.reset();
 		}
 	}
 
