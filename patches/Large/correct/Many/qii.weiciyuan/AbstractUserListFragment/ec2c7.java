diff --git a/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java b/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java
index c8eb870..a6c0dd7 100644
--- a/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java
+++ b/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java
@@ -376,7 +376,7 @@
         protected void onCancelled(UserListBean newValue) {
             super.onCancelled(newValue);
 
-            if (this.e != null) {
+            if (this.e != null && getActivity() != null) {
                 Toast.makeText(getActivity(), e.getError(), Toast.LENGTH_SHORT).show();
                 showErrorFooterView();
             } else {
