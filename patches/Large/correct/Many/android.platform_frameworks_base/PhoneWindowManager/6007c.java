diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 886fd9a..6d876bb 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -5908,7 +5908,7 @@
                     // handled it send it to the session manager to
                     // figure out.
                     MediaSessionLegacyHelper.getHelper(mContext).sendVolumeKeyEvent(
-                            event, AudioManager.USE_DEFAULT_STREAM_TYPE, false);
+                            event, AudioManager.USE_DEFAULT_STREAM_TYPE, true);
                 }
                 break;
             }
