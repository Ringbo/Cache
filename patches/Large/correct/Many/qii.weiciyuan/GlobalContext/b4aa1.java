diff --git a/src/org/qii/weiciyuan/support/utils/GlobalContext.java b/src/org/qii/weiciyuan/support/utils/GlobalContext.java
index 3214537..fca2ec4 100644
--- a/src/org/qii/weiciyuan/support/utils/GlobalContext.java
+++ b/src/org/qii/weiciyuan/support/utils/GlobalContext.java
@@ -187,7 +187,7 @@
         };
     }
 
-    public Map<String, Bitmap> getEmotionsPics() {
+    public synchronized Map<String, Bitmap> getEmotionsPics() {
         if (emotionsPic != null && emotionsPic.size() > 0) {
             return emotionsPic;
         } else {
