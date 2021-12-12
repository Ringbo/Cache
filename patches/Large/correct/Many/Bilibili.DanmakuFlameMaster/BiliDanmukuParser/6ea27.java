diff --git a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/parser/android/BiliDanmukuParser.java b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/parser/android/BiliDanmukuParser.java
index 7cf828a..f07fb30 100644
--- a/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/parser/android/BiliDanmukuParser.java
+++ b/DanmakuFlameMaster/src/main/java/master/flame/danmaku/danmaku/parser/android/BiliDanmukuParser.java
@@ -180,10 +180,10 @@
                     if (textArr.length >= 11) {
                         endX = Float.parseFloat(textArr[7]);
                         endY = Float.parseFloat(textArr[8]);
-                        if("".equals(textArr[9])){
+                        if(!"".equals(textArr[9])){
                             translationDuration = Integer.parseInt(textArr[9]);
                         }
-                        if("".equals(textArr[10])){
+                        if(!"".equals(textArr[10])){
                             translationStartDelay = (long) (Float.parseFloat(textArr[10]));
                         }
                     }
