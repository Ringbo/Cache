diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListPane.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListPane.java
index e11d13c..2b48dce 100755
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListPane.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListPane.java
@@ -157,7 +157,8 @@
 
         // Searching for the right proto contact to use as default for the
         // chat conversation.
-        Contact defaultContact = metaContact.getDefaultContact();
+        Contact defaultContact = metaContact.getDefaultContact(
+                                    OperationSetBasicInstantMessaging.class);
 
         ProtocolProviderService defaultProvider
             = defaultContact.getProtocolProvider();
