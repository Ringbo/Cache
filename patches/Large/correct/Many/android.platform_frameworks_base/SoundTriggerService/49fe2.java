diff --git a/services/voiceinteraction/java/com/android/server/soundtrigger/SoundTriggerService.java b/services/voiceinteraction/java/com/android/server/soundtrigger/SoundTriggerService.java
index 13e3069..1b842fe 100644
--- a/services/voiceinteraction/java/com/android/server/soundtrigger/SoundTriggerService.java
+++ b/services/voiceinteraction/java/com/android/server/soundtrigger/SoundTriggerService.java
@@ -965,8 +965,9 @@
                             MAX_SOUND_TRIGGER_DETECTION_SERVICE_OPS_PER_DAY,
                             Integer.MAX_VALUE);
 
+                    // As we currently cannot dropping an op safely, disable throttling
                     int opsAdded = mNumOps.getOpsAdded();
-                    if (mNumOps.getOpsAdded() >= opsAllowed) {
+                    if (false && mNumOps.getOpsAdded() >= opsAllowed) {
                         try {
                             if (DEBUG || opsAllowed + 10 > opsAdded) {
                                 Slog.w(TAG, mPuuid + ": Dropped operation as too many operations "
