diff --git a/services/core/java/com/android/server/media/MediaRouterService.java b/services/core/java/com/android/server/media/MediaRouterService.java
index 5ba8f48..922df1e 100644
--- a/services/core/java/com/android/server/media/MediaRouterService.java
+++ b/services/core/java/com/android/server/media/MediaRouterService.java
@@ -355,7 +355,7 @@
     void restoreRoute(int uid) {
         ClientRecord clientRecord = null;
         UserRecord userRecord = mUserRecords.get(UserHandle.getUserId(uid));
-        if (userRecord.mClientRecords != null) {
+        if (userRecord != null && userRecord.mClientRecords != null) {
             for (ClientRecord cr : userRecord.mClientRecords) {
                 if (validatePackageName(uid, cr.mPackageName)) {
                     clientRecord = cr;
