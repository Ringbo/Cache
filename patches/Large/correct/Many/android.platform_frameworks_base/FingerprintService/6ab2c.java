diff --git a/services/core/java/com/android/server/fingerprint/FingerprintService.java b/services/core/java/com/android/server/fingerprint/FingerprintService.java
index e83b228..0f29942 100644
--- a/services/core/java/com/android/server/fingerprint/FingerprintService.java
+++ b/services/core/java/com/android/server/fingerprint/FingerprintService.java
@@ -1180,7 +1180,7 @@
 
             // Statistics about secure fingerprint transactions (e.g. to unlock password
             // storage, make secure purchases, etc.)
-            final PerformanceStats crypto = mPerformanceMap.get(userId);
+            final PerformanceStats crypto = mCryptoPerformanceMap.get(userId);
             if (crypto != null) {
                 final long countsToken = proto.start(FingerprintUserStatsProto.CRYPTO);
                 proto.write(FingerprintActionStatsProto.ACCEPT, crypto.accept);
