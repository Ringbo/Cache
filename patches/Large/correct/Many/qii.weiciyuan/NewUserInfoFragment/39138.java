diff --git a/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java b/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java
index 64e5c31..2bf39b0 100644
--- a/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java
+++ b/src/org/qii/weiciyuan/ui/userinfo/NewUserInfoFragment.java
@@ -909,7 +909,7 @@
 
             refreshLayout(getList());
 
-            if (getList().getSize() == 0) {
+            if (getList().getSize() == 0 && getActivity() != null) {
                 loadNewMsg();
             }
         }
