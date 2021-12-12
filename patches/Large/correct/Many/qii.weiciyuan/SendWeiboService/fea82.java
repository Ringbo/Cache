diff --git a/src/org/qii/weiciyuan/othercomponent/SendWeiboService.java b/src/org/qii/weiciyuan/othercomponent/SendWeiboService.java
index 110bd4f..35c3bc7 100644
--- a/src/org/qii/weiciyuan/othercomponent/SendWeiboService.java
+++ b/src/org/qii/weiciyuan/othercomponent/SendWeiboService.java
@@ -106,7 +106,7 @@
                 @Override
                 public void transferred(long data) {
 
-                    publishProgress((long) (data * 0.9));
+                    publishProgress((long) (data * 0.95));
                 }
 
                 @Override
