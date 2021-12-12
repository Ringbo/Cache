diff --git a/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgFragment.java b/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgFragment.java
index c14feea..a06faa6 100644
--- a/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgFragment.java
+++ b/src/org/qii/weiciyuan/ui/browser/BrowserWeiboMsgFragment.java
@@ -518,7 +518,7 @@
         if (!msg.isMultiPics()) {
 
             if (Utility.isTaskStopped(picTask)) {
-                layout.setVisibility(View.VISIBLE);
+                view.setVisibility(View.VISIBLE);
 
                 if (refreshPic) {
                     picTask = new MsgDetailReadWorker(view, msg);
