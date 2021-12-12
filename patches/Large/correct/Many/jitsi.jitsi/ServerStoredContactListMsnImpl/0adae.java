diff --git a/src/net/java/sip/communicator/impl/protocol/msn/ServerStoredContactListMsnImpl.java b/src/net/java/sip/communicator/impl/protocol/msn/ServerStoredContactListMsnImpl.java
index 6c29eab..09d2d1a 100644
--- a/src/net/java/sip/communicator/impl/protocol/msn/ServerStoredContactListMsnImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/msn/ServerStoredContactListMsnImpl.java
@@ -800,7 +800,7 @@
             ContactMsnImpl contactImpl =
                 findContactById(contact.getEmail().getEmailAddress());
 
-            if (contactImpl != null)
+            if (contactImpl == null)
                 return;
 
             contactImpl.setStatusMessage(contact.getPersonalMessage());
