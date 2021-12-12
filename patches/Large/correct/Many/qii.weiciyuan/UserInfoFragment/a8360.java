diff --git a/src/org/qii/weiciyuan/ui/userinfo/UserInfoFragment.java b/src/org/qii/weiciyuan/ui/userinfo/UserInfoFragment.java
index e4c1d74..e11c6c1 100644
--- a/src/org/qii/weiciyuan/ui/userinfo/UserInfoFragment.java
+++ b/src/org/qii/weiciyuan/ui/userinfo/UserInfoFragment.java
@@ -393,7 +393,7 @@
         @Override
         protected void onCancelled(UserBean userBean) {
             super.onCancelled(userBean);
-            if (e != null) {
+            if (e != null && getActivity() != null) {
                 Toast.makeText(getActivity(), e.getError(), Toast.LENGTH_SHORT).show();
             }
             stopRefreshMenuAnimation();
