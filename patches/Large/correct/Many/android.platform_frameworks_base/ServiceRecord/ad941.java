diff --git a/services/core/java/com/android/server/am/ServiceRecord.java b/services/core/java/com/android/server/am/ServiceRecord.java
index 42c405f..027dc08 100644
--- a/services/core/java/com/android/server/am/ServiceRecord.java
+++ b/services/core/java/com/android/server/am/ServiceRecord.java
@@ -495,8 +495,9 @@
                                         Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                 runningIntent.setData(Uri.fromParts("package",
                                         appInfo.packageName, null));
-                                PendingIntent pi = PendingIntent.getActivity(ams.mContext, 0,
-                                        runningIntent, PendingIntent.FLAG_UPDATE_CURRENT);
+                                PendingIntent pi = PendingIntent.getActivityAsUser(ams.mContext, 0,
+                                        runningIntent, PendingIntent.FLAG_UPDATE_CURRENT, null,
+                                        UserHandle.of(userId));
                                 notiBuilder.setColor(ams.mContext.getColor(
                                         com.android.internal
                                                 .R.color.system_notification_accent_color));
