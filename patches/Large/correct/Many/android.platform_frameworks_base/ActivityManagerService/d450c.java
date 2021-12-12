diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 75bad46..2aca617c 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -26620,7 +26620,7 @@
                 record.waitingForNetwork = false;
                 final long totalTime = SystemClock.uptimeMillis() - startTime;
                 if (totalTime >= mWaitForNetworkTimeoutMs || DEBUG_NETWORK) {
-                    Slog.wtf(TAG_NETWORK, "Total time waited for network rules to get updated: "
+                    Slog.w(TAG_NETWORK, "Total time waited for network rules to get updated: "
                             + totalTime + ". Uid: " + callingUid + " procStateSeq: "
                             + procStateSeq + " UidRec: " + record
                             + " validateUidRec: " + mValidateUids.get(callingUid));
