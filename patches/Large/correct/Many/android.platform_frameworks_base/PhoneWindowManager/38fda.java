diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 7542bae..91a163a 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -5909,7 +5909,7 @@
                     // handled it send it to the session manager to
                     // figure out.
                     MediaSessionLegacyHelper.getHelper(mContext).sendVolumeKeyEvent(
-                            event, AudioManager.USE_DEFAULT_STREAM_TYPE, false);
+                            event, AudioManager.USE_DEFAULT_STREAM_TYPE, true);
                 }
                 break;
             }
