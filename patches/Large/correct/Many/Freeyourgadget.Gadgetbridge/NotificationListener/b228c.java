diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/NotificationListener.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/NotificationListener.java
index fc01b3e..39e461b 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/NotificationListener.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/externalevents/NotificationListener.java
@@ -342,7 +342,7 @@
         muteAction.type = NotificationSpec.Action.TYPE_SYNTECTIC_MUTE;
         notificationSpec.attachedActions.add(muteAction);
 
-        mNotificationHandleLookup.add(notificationSpec.getId(), sbn.getId()); // for both DISMISS and OPEN
+        mNotificationHandleLookup.add(notificationSpec.getId(), sbn.getPostTime()); // for both DISMISS and OPEN
         //getPostTime()); // for both DISMISS and OPEN
         mPackageLookup.add(notificationSpec.getId(), sbn.getPackageName()); // for MUTE
 
