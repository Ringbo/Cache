diff --git a/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java b/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java
index 3f3e7b8..4fac050 100644
--- a/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java
+++ b/src/org/qii/weiciyuan/ui/main/MainTimeLineActivity.java
@@ -615,7 +615,7 @@
             if (accountBean.equals(intentAccount)) {
                 MessageListBean mentionsWeibo = intent
                         .getParcelableExtra(BundleArgsConstants.MENTIONS_WEIBO_EXTRA);
-                MessageListBean mentionsComment = intent
+                CommentListBean mentionsComment = intent
                         .getParcelableExtra(BundleArgsConstants.MENTIONS_COMMENT_EXTRA);
                 CommentListBean commentsToMe = intent
                         .getParcelableExtra(BundleArgsConstants.COMMENTS_TO_ME_EXTRA);
