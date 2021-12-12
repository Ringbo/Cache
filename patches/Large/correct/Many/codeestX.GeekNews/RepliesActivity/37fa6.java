diff --git a/app/src/main/java/com/codeest/geeknews/ui/vtex/activity/RepliesActivity.java b/app/src/main/java/com/codeest/geeknews/ui/vtex/activity/RepliesActivity.java
index 6df3d78..1b97089 100644
--- a/app/src/main/java/com/codeest/geeknews/ui/vtex/activity/RepliesActivity.java
+++ b/app/src/main/java/com/codeest/geeknews/ui/vtex/activity/RepliesActivity.java
@@ -133,10 +133,10 @@
                 }
                 break;
             case R.id.action_copy:
-                SystemUtil.copyToClipBoard(mContext, VtexApis.REPLIES_URL + id);
+                SystemUtil.copyToClipBoard(mContext, VtexApis.REPLIES_URL + topicId);
                 return true;
             case R.id.action_share:
-                ShareUtil.shareText(mContext, VtexApis.REPLIES_URL + id, "分享一篇文章");
+                ShareUtil.shareText(mContext, VtexApis.REPLIES_URL + topicId, "分享一篇文章");
         }
         return super.onOptionsItemSelected(item);
     }
