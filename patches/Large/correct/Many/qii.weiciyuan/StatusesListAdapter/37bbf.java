diff --git a/src/org/qii/weiciyuan/ui/userinfo/StatusesListAdapter.java b/src/org/qii/weiciyuan/ui/userinfo/StatusesListAdapter.java
index 55b8d76..690809c 100644
--- a/src/org/qii/weiciyuan/ui/userinfo/StatusesListAdapter.java
+++ b/src/org/qii/weiciyuan/ui/userinfo/StatusesListAdapter.java
@@ -135,7 +135,7 @@
             holder.content.setText(msg.getSpannableString());
         } else {
             ListViewTool.addJustHighLightLinks(msg);
-            holder.content.setText(msg.getText());
+            holder.content.setText(msg.getSpannableString());
         }
         holder.time.setText(msg.getListviewItemShowTime());
 
