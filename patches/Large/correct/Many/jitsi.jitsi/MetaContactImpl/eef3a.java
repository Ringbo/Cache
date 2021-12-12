diff --git a/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java b/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java
index f82765b..11fe696 100644
--- a/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java
+++ b/src/net/java/sip/communicator/impl/contactlist/MetaContactImpl.java
@@ -437,7 +437,7 @@
                         = capabilities.get(operationSet.getName());
 
                     if (capContacts == null
-                            || !capContacts.contains(defaultContact))
+                            || !capContacts.contains(protoContact))
                     {
                         continue;
                     }
