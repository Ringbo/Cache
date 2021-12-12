diff --git a/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java b/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java
index 5c36db3..8f6adfc 100644
--- a/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java
+++ b/Android/chatinput/src/main/java/cn/jiguang/imui/chatinput/ChatInputView.java
@@ -135,7 +135,7 @@
     private int mSoftKeyboardHeight;
     private int mNowh;
     private int mOldh;
-    public static int sMenuHeight = 800;
+    public static int sMenuHeight = 831;
 
     private boolean mShowSoftInput = false;
 
@@ -1217,7 +1217,7 @@
                 if (mOldh != -1 && mNowh != mOldh) {
                     mShowSoftInput = mNowh > 0;
                     mSoftKeyboardHeight = mShowSoftInput ? mNowh : 0;
-                    sMenuHeight = mSoftKeyboardHeight;
+                    sMenuHeight = mSoftKeyboardHeight > 0 ? mSoftKeyboardHeight : 831;
                 }
                 mOldh = mNowh;
             } catch (Exception e) {
