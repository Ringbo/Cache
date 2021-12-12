diff --git a/portlets/notifications-portlet/docroot/WEB-INF/src/com/liferay/notifications/notifications/portlet/NotificationsPortlet.java b/portlets/notifications-portlet/docroot/WEB-INF/src/com/liferay/notifications/notifications/portlet/NotificationsPortlet.java
index 5c27ba5..245ba32 100644
--- a/portlets/notifications-portlet/docroot/WEB-INF/src/com/liferay/notifications/notifications/portlet/NotificationsPortlet.java
+++ b/portlets/notifications-portlet/docroot/WEB-INF/src/com/liferay/notifications/notifications/portlet/NotificationsPortlet.java
@@ -300,15 +300,15 @@
 				UserNotificationEventLocalServiceUtil.
 					getDeliveredUserNotificationEvents(
 						themeDisplay.getUserId(),
-						UserNotificationDeliveryConstants.TYPE_WEBSITE,
+						UserNotificationDeliveryConstants.TYPE_WEBSITE, true,
 						actionable, start, end);
 
 			total =
 				UserNotificationEventLocalServiceUtil.
-					getDeliveredUserNotificationEventsCount(
+					getArchivedUserNotificationEventsCount(
 						themeDisplay.getUserId(),
 						UserNotificationDeliveryConstants.TYPE_WEBSITE,
-						actionable);
+						actionable, false);
 		}
 		else {
 			userNotificationEvents =
