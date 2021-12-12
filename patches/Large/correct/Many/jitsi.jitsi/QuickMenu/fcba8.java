diff --git a/src/net/java/sip/communicator/impl/gui/main/menus/QuickMenu.java b/src/net/java/sip/communicator/impl/gui/main/menus/QuickMenu.java
index 92b49c4..0472700 100755
--- a/src/net/java/sip/communicator/impl/gui/main/menus/QuickMenu.java
+++ b/src/net/java/sip/communicator/impl/gui/main/menus/QuickMenu.java
@@ -96,7 +96,7 @@
             Messages.getI18NString("showOfflineUsers").getText());
         this.addButton.setToolTipText(
             Messages.getI18NString("addContact").getText());        
-        this.addButton.setToolTipText(
+        this.soundButton.setToolTipText(
             Messages.getI18NString("soundOnOff").getText());
 
         this.updateMuteButton(
