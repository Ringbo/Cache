diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 1005bd7..7655e92 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -2160,7 +2160,7 @@
     private void handleReleaseNetworkRequest(NetworkRequest request, int callingUid) {
         NetworkRequestInfo nri = mNetworkRequests.get(request);
         if (nri != null) {
-            if (nri.mUid != callingUid) {
+            if (Process.SYSTEM_UID != callingUid && nri.mUid != callingUid) {
                 if (DBG) log("Attempt to release unowned NetworkRequest " + request);
                 return;
             }
