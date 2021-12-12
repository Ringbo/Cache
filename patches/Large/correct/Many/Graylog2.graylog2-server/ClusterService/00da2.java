diff --git a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/ClusterService.java b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/ClusterService.java
index 1edb943..0d67a26 100644
--- a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/ClusterService.java
+++ b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/ClusterService.java
@@ -82,7 +82,7 @@
         List<Notification> notifications = Lists.newArrayList();
         for (NotificationSummaryResponse notification : r.notifications) {
             try {
-                notifications.add(new Notification(notification));
+                notifications.add(new Notification(notification, nodeService));
             } catch (IllegalArgumentException e) {
                 LOG.warn("There is a notification type we can't handle: [{}]", notification.type);
             }
