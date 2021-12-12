diff --git a/services/core/java/com/android/server/fingerprint/FingerprintService.java b/services/core/java/com/android/server/fingerprint/FingerprintService.java
index 1be3267..96a60ee 100644
--- a/services/core/java/com/android/server/fingerprint/FingerprintService.java
+++ b/services/core/java/com/android/server/fingerprint/FingerprintService.java
@@ -540,7 +540,7 @@
             } else {
                 result = true; // client not listening
             }
-            if (fpId <= 0) {
+	    if (fpId == 0) {
                 FingerprintUtils.vibrateFingerprintError(getContext());
                 result |= handleFailedAttempt(this);
             } else {
