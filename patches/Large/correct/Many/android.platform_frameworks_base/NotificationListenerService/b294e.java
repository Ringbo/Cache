diff --git a/core/java/android/service/notification/NotificationListenerService.java b/core/java/android/service/notification/NotificationListenerService.java
index b22fd9c..35fff74 100644
--- a/core/java/android/service/notification/NotificationListenerService.java
+++ b/core/java/android/service/notification/NotificationListenerService.java
@@ -478,7 +478,7 @@
     public final int getCurrentInterruptionFilter() {
         if (!isBound()) return 0;
         try {
-            return getNotificationInterface().getHintsFromListener(mWrapper);
+            return getNotificationInterface().getInterruptionFilterFromListener(mWrapper);
         } catch (android.os.RemoteException ex) {
             Log.v(TAG, "Unable to contact notification manager", ex);
             return 0;
