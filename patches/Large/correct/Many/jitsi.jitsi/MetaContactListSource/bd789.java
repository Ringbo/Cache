diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/MetaContactListSource.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/MetaContactListSource.java
index 88534e0..1b301fd 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/MetaContactListSource.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/MetaContactListSource.java
@@ -1052,9 +1052,9 @@
 
                     actionButton.setIconImage(
                         new ImageIcon(ca.getIcon()).getImage());
-                    actionButton.setRolloverImage(
+                    actionButton.setRolloverIcon(
                         new ImageIcon(ca.getRolloverIcon()).getImage());
-                    actionButton.setPressedImage(
+                    actionButton.setPressedIcon(
                         new ImageIcon(ca.getPressedIcon()).getImage());
 
                     actionButton.addActionListener(new ActionListener()
