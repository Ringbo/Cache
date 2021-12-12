diff --git a/src/org/qii/weiciyuan/ui/send/WriteReplyToCommentActivity.java b/src/org/qii/weiciyuan/ui/send/WriteReplyToCommentActivity.java
index c59b87a..49e19c0 100644
--- a/src/org/qii/weiciyuan/ui/send/WriteReplyToCommentActivity.java
+++ b/src/org/qii/weiciyuan/ui/send/WriteReplyToCommentActivity.java
@@ -307,7 +307,8 @@
 
     @Override
     protected AccountBean getCurrentAccountBean() {
-        if (WriteReplyToCommentActivity.ACTION_NOTIFICATION_REPLY.equals(getIntent().getAction())) {
+        if (WriteReplyToCommentActivity.ACTION_NOTIFICATION_REPLY.equals(getIntent().getAction())
+                || WriteReplyToCommentActivity.ACTION_SEND_FAILED.equals(getIntent().getAction())) {
             AccountBean accountBean = ((AccountBean) getIntent().getParcelableExtra("account"));
             return accountBean;
         } else {
