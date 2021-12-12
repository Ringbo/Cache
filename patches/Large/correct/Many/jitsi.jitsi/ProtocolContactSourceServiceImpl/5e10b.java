diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ProtocolContactSourceServiceImpl.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ProtocolContactSourceServiceImpl.java
index 24c0a74..d0088cd 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ProtocolContactSourceServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/contactsource/ProtocolContactSourceServiceImpl.java
@@ -224,9 +224,9 @@
 
                 if (queryString == null
                     || queryString.length() <= 0
-                    || metaContact.getDisplayName().startsWith(queryString)
-                    || contactAddress.startsWith(queryString)
-                    || contactDisplayName.startsWith(queryString))
+                    || metaContact.getDisplayName().contains(queryString)
+                    || contactAddress.contains(queryString)
+                    || contactDisplayName.contains(queryString))
                 {
                     ContactDetail contactDetail
                         = new ContactDetail(contactAddress);
