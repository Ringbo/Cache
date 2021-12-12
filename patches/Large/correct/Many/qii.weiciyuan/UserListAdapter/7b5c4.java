diff --git a/src/org/qii/weiciyuan/ui/adapter/UserListAdapter.java b/src/org/qii/weiciyuan/ui/adapter/UserListAdapter.java
index c25b596..0a3937f 100644
--- a/src/org/qii/weiciyuan/ui/adapter/UserListAdapter.java
+++ b/src/org/qii/weiciyuan/ui/adapter/UserListAdapter.java
@@ -92,7 +92,7 @@
     public View getView(int position, View convertView, ViewGroup parent) {
 
         ViewHolder holder;
-        if (convertView == null) {
+        if (convertView == null || convertView.getTag() == null) {
             holder = new ViewHolder();
             convertView = inflater.inflate(R.layout.user_listview_item_layout, parent, false);
             holder.username = ViewUtility.findViewById(convertView, R.id.username);
