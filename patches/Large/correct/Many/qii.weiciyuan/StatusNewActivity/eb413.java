diff --git a/src/org/qii/weiciyuan/ui/send/StatusNewActivity.java b/src/org/qii/weiciyuan/ui/send/StatusNewActivity.java
index 6257811..3a6c53b 100644
--- a/src/org/qii/weiciyuan/ui/send/StatusNewActivity.java
+++ b/src/org/qii/weiciyuan/ui/send/StatusNewActivity.java
@@ -293,7 +293,7 @@
                 getLocation();
                 break;
             case R.id.menu_add_pic:
-                new MyAlertDialogFragment().show(getFragmentManager(), "");
+                new PictureSelectDialog().show(getFragmentManager(), "");
                 break;
 
             case R.id.menu_send:
