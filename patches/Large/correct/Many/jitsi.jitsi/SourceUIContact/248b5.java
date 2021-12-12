diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/SourceUIContact.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/SourceUIContact.java
index 0bf4970..c63b1c8 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/SourceUIContact.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/SourceUIContact.java
@@ -121,9 +121,9 @@
     {
         byte[] image = sourceContact.getImage();
 
-        if (image != null)
+        if ((image != null) && (image.length > 0))
         {
-            ImageIcon icon = new ImageIcon();
+            ImageIcon icon = new ImageIcon(image);
 
             if (icon.getIconWidth() > width || icon.getIconHeight() > height)
             {
