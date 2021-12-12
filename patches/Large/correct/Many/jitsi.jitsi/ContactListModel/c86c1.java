diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListModel.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListModel.java
index fa96fa5..7f9b39b 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListModel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListModel.java
@@ -495,7 +495,7 @@
     {
         // Lays on the fact that the default contact is the most connected.
         if (contact.getDefaultContact().getPresenceStatus()
-                .getStatus() > PresenceStatus.ONLINE_THRESHOLD)
+                .getStatus() >= PresenceStatus.ONLINE_THRESHOLD)
         {
             return true;
         }
