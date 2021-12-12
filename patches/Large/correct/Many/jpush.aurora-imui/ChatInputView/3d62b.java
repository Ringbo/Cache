diff --git a/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java b/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java
index 862f6d7..8112f89 100644
--- a/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java
+++ b/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java
@@ -1011,7 +1011,7 @@
                     requestLayout();
                     invalidate();
                 }
-                if (mSelectPhotoView.getSelectFiles().size() > 0) {
+                if (mSelectPhotoView.getSelectFiles() != null && mSelectPhotoView.getSelectFiles().size() > 0) {
                     mSendCountTv.setVisibility(View.VISIBLE);
                 }
             }
