diff --git a/src/biz/bokhorst/xprivacy/XPrivacy.java b/src/biz/bokhorst/xprivacy/XPrivacy.java
index bcc76c6..a0fa4d8 100644
--- a/src/biz/bokhorst/xprivacy/XPrivacy.java
+++ b/src/biz/bokhorst/xprivacy/XPrivacy.java
@@ -57,7 +57,7 @@
 
 		// Media recorder
 		hook(new XMediaRecorder("setOutputFile", XRestriction.cMedia, new String[] { "RECORD_AUDIO", "RECORD_VIDEO" }),
-				"android.media.MediaRecorder", false);
+				"android.media.MediaRecorder");
 
 		// Settings secure
 		hook(new XSettingsSecure("getString", XRestriction.cIdentification), "android.provider.Settings.Secure");
