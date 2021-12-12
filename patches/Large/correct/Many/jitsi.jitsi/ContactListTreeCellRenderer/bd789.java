diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
index c9c421c..b301f95 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
@@ -1537,16 +1537,16 @@
 
         callButton.setIconImage(ImageLoader.getImage(
                 ImageLoader.CALL_BUTTON_SMALL));
-        callButton.setRolloverImage(ImageLoader.getImage(
+        callButton.setRolloverIcon(ImageLoader.getImage(
                 ImageLoader.CALL_BUTTON_SMALL_ROLLOVER));
-        callButton.setPressedImage(ImageLoader.getImage(
+        callButton.setPressedIcon(ImageLoader.getImage(
                 ImageLoader.CALL_BUTTON_SMALL_PRESSED));
 
         chatButton.setIconImage(ImageLoader.getImage(
                 ImageLoader.CHAT_BUTTON_SMALL));
-        chatButton.setRolloverImage(ImageLoader.getImage(
+        chatButton.setRolloverIcon(ImageLoader.getImage(
             ImageLoader.CHAT_BUTTON_SMALL_ROLLOVER));
-        chatButton.setPressedImage(ImageLoader.getImage(
+        chatButton.setPressedIcon(ImageLoader.getImage(
                 ImageLoader.CHAT_BUTTON_SMALL_PRESSED));
 
         msgReceivedImage
@@ -1566,23 +1566,23 @@
 
         callVideoButton.setIconImage(
             ImageLoader.getImage(ImageLoader.CALL_VIDEO_BUTTON_SMALL));
-        callVideoButton.setRolloverImage(
+        callVideoButton.setRolloverIcon(
             ImageLoader.getImage(ImageLoader.CALL_VIDEO_BUTTON_SMALL_ROLLOVER));
-        callVideoButton.setPressedImage(
+        callVideoButton.setPressedIcon(
             ImageLoader.getImage(ImageLoader.CALL_VIDEO_BUTTON_SMALL_PRESSED));
 
         desktopSharingButton.setIconImage(
             ImageLoader.getImage(ImageLoader.DESKTOP_BUTTON_SMALL));
-        desktopSharingButton.setRolloverImage(
+        desktopSharingButton.setRolloverIcon(
             ImageLoader.getImage(ImageLoader.DESKTOP_BUTTON_SMALL_ROLLOVER));
-        desktopSharingButton.setPressedImage(
+        desktopSharingButton.setPressedIcon(
             ImageLoader.getImage(ImageLoader.DESKTOP_BUTTON_SMALL_PRESSED));
 
         addContactButton.setIconImage(
             ImageLoader.getImage(ImageLoader.ADD_CONTACT_BUTTON_SMALL));
-        addContactButton.setRolloverImage(
+        addContactButton.setRolloverIcon(
             ImageLoader.getImage(ImageLoader.ADD_CONTACT_BUTTON_SMALL_ROLLOVER));
-        addContactButton.setPressedImage(
+        addContactButton.setPressedIcon(
             ImageLoader.getImage(ImageLoader.ADD_CONTACT_BUTTON_SMALL_PRESSED));
     }
 
