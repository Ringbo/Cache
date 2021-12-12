diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/ActionMenuPanel.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/ActionMenuPanel.java
index 8fb5c70..ae8e273 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/ActionMenuPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/ActionMenuPanel.java
@@ -178,7 +178,7 @@
         {
             boolean isShowOffline = ConfigurationManager.isShowOffline();
 
-            updateShowOfflineButton(button, isShowOffline);
+            updateShowOfflineButton(button, !isShowOffline);
 
             GuiActivator.getUIService().getMainFrame().getContactListPanel()
                 .getContactList().setShowOffline(!isShowOffline);
@@ -187,7 +187,7 @@
         {
             boolean isMute = GuiActivator.getAudioNotifier().isMute();
 
-            updateMuteButton(button, isMute);
+            updateMuteButton(button, !isMute);
             GuiActivator.getAudioNotifier().setMute(!isMute);
         }
         else if (buttonName.equals("chatRooms"))
@@ -214,10 +214,10 @@
     {
         if(!isShowOffline)
             showOfflineButton.setBackgroundImage(
-                ImageLoader.getImage(ImageLoader.QUICK_MENU_SHOW_OFFLINE_ICON));
+                ImageLoader.getImage(ImageLoader.QUICK_MENU_HIDE_OFFLINE_ICON));
         else
             showOfflineButton.setBackgroundImage(
-                ImageLoader.getImage(ImageLoader.QUICK_MENU_HIDE_OFFLINE_ICON));
+                ImageLoader.getImage(ImageLoader.QUICK_MENU_SHOW_OFFLINE_ICON));
 
         showOfflineButton.repaint();
         this.getParent().repaint();
