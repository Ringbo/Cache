diff --git a/services/core/java/com/android/server/am/ServiceRecord.java b/services/core/java/com/android/server/am/ServiceRecord.java
index bc297de..0a081e9 100644
--- a/services/core/java/com/android/server/am/ServiceRecord.java
+++ b/services/core/java/com/android/server/am/ServiceRecord.java
@@ -441,7 +441,7 @@
                     Notification localForegroundNoti = _foregroundNoti;
                     try {
                         if (localForegroundNoti.getSmallIcon() == null) {
-                            // It is not correct for the caller to supply a notification
+                            // It is not correct for the caller to not supply a notification
                             // icon, but this used to be able to slip through, so for
                             // those dirty apps we will create a notification clearly
                             // blaming the app.
@@ -458,8 +458,8 @@
                             }
                             Context ctx = null;
                             try {
-                                ctx = ams.mContext.createPackageContext(
-                                        appInfo.packageName, 0);
+                                ctx = ams.mContext.createPackageContextAsUser(
+                                        appInfo.packageName, 0, new UserHandle(userId));
 
                                 Notification.Builder notiBuilder = new Notification.Builder(ctx);
 
