diff --git a/src/org/qii/weiciyuan/ui/userinfo/MyInfoFragment.java b/src/org/qii/weiciyuan/ui/userinfo/MyInfoFragment.java
index c2dffd0..a7c9024 100644
--- a/src/org/qii/weiciyuan/ui/userinfo/MyInfoFragment.java
+++ b/src/org/qii/weiciyuan/ui/userinfo/MyInfoFragment.java
@@ -200,7 +200,7 @@
         @Override
         protected void onCancelled(UserBean userBean) {
             super.onCancelled(userBean);
-            if (e != null) {
+            if (e != null && getActivity() != null) {
                 Toast.makeText(getActivity(), e.getError(), Toast.LENGTH_SHORT).show();
             }
         }
