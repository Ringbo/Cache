diff --git a/src/net/java/sip/communicator/impl/gui/main/chat/ContactPhotoPanel.java b/src/net/java/sip/communicator/impl/gui/main/chat/ContactPhotoPanel.java
index d3c634a..8f95667 100644
--- a/src/net/java/sip/communicator/impl/gui/main/chat/ContactPhotoPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chat/ContactPhotoPanel.java
@@ -126,7 +126,8 @@
         // it sa mutlichat room which
         // cannot be saved with add contact dialog
         if (!chatSession.isDescriptorPersistent()
-            && !(chatSession instanceof ConferenceChatSession))
+            && !(chatSession instanceof ConferenceChatSession)
+            && !ConfigurationManager.isAddContactDisabled())
             this.add(addContactButton, 0);
         else
             this.remove(addContactButton);
