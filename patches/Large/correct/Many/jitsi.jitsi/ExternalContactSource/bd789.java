diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ExternalContactSource.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ExternalContactSource.java
index 88bfca1..8e6b82b 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ExternalContactSource.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ExternalContactSource.java
@@ -236,9 +236,9 @@
 
             actionButton.setIconImage(
                 new ImageIcon(ca.getIcon()).getImage());
-            actionButton.setRolloverImage(
+            actionButton.setRolloverIcon(
                 new ImageIcon(ca.getRolloverIcon()).getImage());
-            actionButton.setPressedImage(
+            actionButton.setPressedIcon(
                 new ImageIcon(ca.getPressedIcon()).getImage());
 
             actionButton.addActionListener(new ActionListener()
