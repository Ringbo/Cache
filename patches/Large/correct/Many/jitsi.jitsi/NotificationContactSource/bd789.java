diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/notifsource/NotificationContactSource.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/notifsource/NotificationContactSource.java
index 60f3806..f11f388 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/notifsource/NotificationContactSource.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/notifsource/NotificationContactSource.java
@@ -234,9 +234,9 @@
 
                     actionButton.setIconImage(
                         new ImageIcon(ca.getIcon()).getImage());
-                    actionButton.setRolloverImage(
+                    actionButton.setRolloverIcon(
                         new ImageIcon(ca.getRolloverIcon()).getImage());
-                    actionButton.setPressedImage(
+                    actionButton.setPressedIcon(
                         new ImageIcon(ca.getPressedIcon()).getImage());
 
                     actionButton.addActionListener(new ActionListener()
