diff --git a/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java b/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java
index 6fe7da3..0586679 100644
--- a/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java
+++ b/src/org/qii/weiciyuan/ui/adapter/AbstractAppListAdapter.java
@@ -355,7 +355,7 @@
 
         holder.listview_root = (RelativeLayout) convertView.findViewById(R.id.listview_root);
         holder.repost_layout = convertView.findViewById(R.id.repost_layout);
-        holder.repost_flag = (ImageView) convertView.findViewById(R.id.repost_flag);
+        holder.repost_flag = (View) convertView.findViewById(R.id.repost_flag);
         holder.count_layout = (LinearLayout) convertView.findViewById(R.id.count_layout);
         holder.repost_count = (TextView) convertView.findViewById(R.id.repost_count);
         holder.comment_count = (TextView) convertView.findViewById(R.id.comment_count);
@@ -645,7 +645,7 @@
 
         RelativeLayout listview_root;
         View repost_layout;
-        ImageView repost_flag;
+        View repost_flag;
         LinearLayout count_layout;
         TextView repost_count;
         TextView comment_count;
