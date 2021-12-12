diff --git a/src/org/qii/weiciyuan/ui/login/AccountActivity.java b/src/org/qii/weiciyuan/ui/login/AccountActivity.java
index 8fb15dc..78d3b42 100644
--- a/src/org/qii/weiciyuan/ui/login/AccountActivity.java
+++ b/src/org/qii/weiciyuan/ui/login/AccountActivity.java
@@ -291,7 +291,7 @@
             ImageView imageView = (ImageView) mView.findViewById(R.id.imageView_avatar);
 
             if (!TextUtils.isEmpty(accountList.get(i).getAvatar_url())) {
-                commander.downContentPic(imageView, accountList.get(i).getAvatar_url(), i, listView);
+                commander.downloadAvatar(imageView, accountList.get(i).getAvatar_url(), i, listView);
             }
 
             return mView;
