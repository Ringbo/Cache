diff --git a/Android/messagelist/src/main/java/cn/jiguang/imui/messages/ViewHolderController.java b/Android/messagelist/src/main/java/cn/jiguang/imui/messages/ViewHolderController.java
index 6fa2a2c..40c12e2 100644
--- a/Android/messagelist/src/main/java/cn/jiguang/imui/messages/ViewHolderController.java
+++ b/Android/messagelist/src/main/java/cn/jiguang/imui/messages/ViewHolderController.java
@@ -49,7 +49,7 @@
     }
 
     public void remove(int position) {
-        if (mData.size() > 0) {
+        if (null != mData && mData.size() > 0) {
             mData.remove(position);
         }
     }
