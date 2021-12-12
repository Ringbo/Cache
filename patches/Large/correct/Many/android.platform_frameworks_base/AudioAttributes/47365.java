diff --git a/media/java/android/media/AudioAttributes.java b/media/java/android/media/AudioAttributes.java
index e8bc622..0476222 100644
--- a/media/java/android/media/AudioAttributes.java
+++ b/media/java/android/media/AudioAttributes.java
@@ -1035,7 +1035,7 @@
             return fromGetVolumeControlStream ?
                     AudioSystem.STREAM_SYSTEM : AudioSystem.STREAM_SYSTEM_ENFORCED;
         }
-        if ((aa.getFlags() & FLAG_SCO) == FLAG_SCO) {
+        if ((aa.getAllFlags() & FLAG_SCO) == FLAG_SCO) {
             return fromGetVolumeControlStream ?
                     AudioSystem.STREAM_VOICE_CALL : AudioSystem.STREAM_BLUETOOTH_SCO;
         }
