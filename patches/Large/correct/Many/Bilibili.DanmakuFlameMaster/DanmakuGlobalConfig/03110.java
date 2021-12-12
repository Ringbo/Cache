diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/DanmakuGlobalConfig.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/DanmakuGlobalConfig.java
index 22ba872..e2ed1ac 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/DanmakuGlobalConfig.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/model/android/DanmakuGlobalConfig.java
@@ -15,7 +15,7 @@
 public class DanmakuGlobalConfig {
 
     public enum DanmakuConfigTag {
-        FT_DANMAKU_VISIBILITY, FB_DANMAKU_VISIBILITY, L2R_DANMAKU_VISIBILITY, R2L_DANMAKU_VISIBILIY, SPECIAL_DANMAKU_VISIBILITY, TYPEFACE, ALPHA, SCALE_TEXTSIZE, MAXIMUM_NUMS_IN_SCREEN, DANMAKU_STYLE, DANMAKU_BOLD;
+        FT_DANMAKU_VISIBILITY, FB_DANMAKU_VISIBILITY, L2R_DANMAKU_VISIBILITY, R2L_DANMAKU_VISIBILIY, SPECIAL_DANMAKU_VISIBILITY, TYPEFACE, TRANSPARENCY, SCALE_TEXTSIZE, MAXIMUM_NUMS_IN_SCREEN, DANMAKU_STYLE, DANMAKU_BOLD;
 
         public boolean isVisibilityTag() {
             return this.equals(FT_DANMAKU_VISIBILITY) || this.equals(FB_DANMAKU_VISIBILITY)
@@ -110,7 +110,7 @@
         if (newTransparency != transparency) {
             transparency = newTransparency;
             isTranslucent = (newTransparency != AlphaValue.MAX);
-            notifyConfigureChanged(DanmakuConfigTag.ALPHA, p);
+            notifyConfigureChanged(DanmakuConfigTag.TRANSPARENCY, p);
         }
         return this;
     }
