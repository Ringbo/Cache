diff --git a/src/net/java/sip/communicator/impl/contactlist/MetaContactListServiceImpl.java b/src/net/java/sip/communicator/impl/contactlist/MetaContactListServiceImpl.java
index 161182f..53cc229 100644
--- a/src/net/java/sip/communicator/impl/contactlist/MetaContactListServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/contactlist/MetaContactListServiceImpl.java
@@ -2420,7 +2420,7 @@
             {
                 Contact contact
                     = evt.getSourceGroup().getContact(subscriptionAddress);
-                if ( sourceContact != null)
+                if ( contact != null)
                 {
                     this.evt = evt;
                     this.sourceContact = contact;
