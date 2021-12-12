diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/ServerStoredContactListJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/ServerStoredContactListJabberImpl.java
index 02d4739..7a9ffb8 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/ServerStoredContactListJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/ServerStoredContactListJabberImpl.java
@@ -296,7 +296,7 @@
         {
             ContactJabberImpl item = (ContactJabberImpl) rootContacts.next();
 
-            if(item.getAddress().equals(id))
+            if(item.getAddress().equalsIgnoreCase(id))
                 return item;
         }
 
