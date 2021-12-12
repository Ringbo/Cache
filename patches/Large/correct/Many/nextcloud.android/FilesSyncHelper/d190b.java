diff --git a/src/main/java/com/owncloud/android/utils/FilesSyncHelper.java b/src/main/java/com/owncloud/android/utils/FilesSyncHelper.java
index d7bddcd..c301ce6 100644
--- a/src/main/java/com/owncloud/android/utils/FilesSyncHelper.java
+++ b/src/main/java/com/owncloud/android/utils/FilesSyncHelper.java
@@ -229,7 +229,7 @@
             }
         }
 
-        if (!Device.getNetworkType(context).equals(JobRequest.NetworkType.ANY) ||
+        if (!Device.getNetworkType(context).equals(JobRequest.NetworkType.ANY) &&
                 !ConnectivityUtils.isInternetWalled(context)) {
             uploadRequester.retryFailedUploads(
                     context,
