diff --git a/media/java/android/media/videoeditor/VideoEditorProfile.java b/media/java/android/media/videoeditor/VideoEditorProfile.java
index ecdcdfb..202a2df 100755
--- a/media/java/android/media/videoeditor/VideoEditorProfile.java
+++ b/media/java/android/media/videoeditor/VideoEditorProfile.java
@@ -91,7 +91,7 @@
             case MediaProperties.VCODEC_H263:
             case MediaProperties.VCODEC_H264:
             case MediaProperties.VCODEC_MPEG4:
-                 level = native_get_videoeditor_export_profile(vidCodec);
+                 level = native_get_videoeditor_export_level(vidCodec);
                  break;
             default :
                throw new IllegalArgumentException("Unsupported video codec" + vidCodec);
