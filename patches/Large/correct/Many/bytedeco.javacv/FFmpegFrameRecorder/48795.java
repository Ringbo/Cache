diff --git a/src/main/java/org/bytedeco/javacv/FFmpegFrameRecorder.java b/src/main/java/org/bytedeco/javacv/FFmpegFrameRecorder.java
index 639fdbe..099dcab 100644
--- a/src/main/java/org/bytedeco/javacv/FFmpegFrameRecorder.java
+++ b/src/main/java/org/bytedeco/javacv/FFmpegFrameRecorder.java
@@ -192,11 +192,11 @@
             av_free(audio_outbuf);
             audio_outbuf = null;
         }
-        if (video_st.metadata() != null) {
+        if (video_st != null && video_st.metadata() != null) {
             av_dict_free(video_st.metadata());
             video_st.metadata(null);
         }
-        if (audio_st.metadata() != null) {
+        if (audio_st != null && audio_st.metadata() != null) {
             av_dict_free(audio_st.metadata());
             audio_st.metadata(null);
         }
@@ -794,7 +794,7 @@
                 }
             }
         }
-        return (video_pkt.flags() & AV_PKT_FLAG_KEY) == 1;
+        return image != null ? (video_pkt.flags() & AV_PKT_FLAG_KEY) != 0 : got_video_packet[0] != 0;
     }
 
     public boolean recordSamples(Buffer ... samples) throws Exception {
