diff --git a/src/org/qii/weiciyuan/othercomponent/ConnectionChangeReceiver.java b/src/org/qii/weiciyuan/othercomponent/ConnectionChangeReceiver.java
index 5062830..d0ccdc5 100644
--- a/src/org/qii/weiciyuan/othercomponent/ConnectionChangeReceiver.java
+++ b/src/org/qii/weiciyuan/othercomponent/ConnectionChangeReceiver.java
@@ -51,7 +51,7 @@
 
         switch (SettingUtility.getCommentRepostAvatar()) {
             case 1:
-                SettingUtility.setEnableCommentRepostAvatar(Utility.isConnected(context));
+                SettingUtility.setEnableCommentRepostAvatar(Utility.isWifi(context));
                 break;
         }
     }
