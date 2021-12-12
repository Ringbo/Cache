diff --git a/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java b/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java
index cfefe56..c8eb870 100644
--- a/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java
+++ b/src/org/qii/weiciyuan/ui/basefragment/AbstractUserListFragment.java
@@ -310,7 +310,7 @@
         @Override
         protected void onCancelled(UserListBean newValue) {
             super.onCancelled(newValue);
-            if (this.e != null)
+            if (this.e != null && getActivity() != null)
                 Toast.makeText(getActivity(), e.getError(), Toast.LENGTH_SHORT).show();
             cleanWork();
         }
