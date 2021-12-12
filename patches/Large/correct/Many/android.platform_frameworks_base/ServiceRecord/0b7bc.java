diff --git a/services/core/java/com/android/server/am/ServiceRecord.java b/services/core/java/com/android/server/am/ServiceRecord.java
index bc297de..0c11523 100644
--- a/services/core/java/com/android/server/am/ServiceRecord.java
+++ b/services/core/java/com/android/server/am/ServiceRecord.java
@@ -458,8 +458,8 @@
                             }
                             Context ctx = null;
                             try {
-                                ctx = ams.mContext.createPackageContext(
-                                        appInfo.packageName, 0);
+                                ctx = ams.mContext.createPackageContextAsUser(
+                                        appInfo.packageName, 0, new UserHandle(userId));
 
                                 Notification.Builder notiBuilder = new Notification.Builder(ctx);
 
