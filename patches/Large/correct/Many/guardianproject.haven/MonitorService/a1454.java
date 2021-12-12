diff --git a/src/main/java/org/havenapp/main/service/MonitorService.java b/src/main/java/org/havenapp/main/service/MonitorService.java
index 2a22e83..f47ce50 100644
--- a/src/main/java/org/havenapp/main/service/MonitorService.java
+++ b/src/main/java/org/havenapp/main/service/MonitorService.java
@@ -299,7 +299,7 @@
             mLastEvent.setId(eventId);
             doNotification = true;
             // set current event start date in prefs
-            mPrefs.setCurrentSession(mLastEvent.getStartTime());
+            mPrefs.setCurrentSession(mLastEvent.getMStartTime());
         }
         else if (mPrefs.getNotificationTimeMs() == 0)
         {
