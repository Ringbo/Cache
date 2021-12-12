diff --git a/src/main/java/org/elasticsearch/indices/recovery/RecoveryTarget.java b/src/main/java/org/elasticsearch/indices/recovery/RecoveryTarget.java
index 61dd911..e69db95 100644
--- a/src/main/java/org/elasticsearch/indices/recovery/RecoveryTarget.java
+++ b/src/main/java/org/elasticsearch/indices/recovery/RecoveryTarget.java
@@ -462,7 +462,7 @@
         @Override
         public void onFailure(Throwable t) {
             try (RecoveriesCollection.StatusRef statusRef = onGoingRecoveries.getStatus(recoveryId)) {
-                if (statusRef == null) {
+                if (statusRef != null) {
                     logger.error("unexpected error during recovery [{}], failing shard", t, recoveryId);
                     onGoingRecoveries.failRecovery(recoveryId,
                             new RecoveryFailedException(statusRef.status().state(), "unexpected error", t),
