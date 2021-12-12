diff --git a/src/net/java/sip/communicator/impl/msghistory/MessageSourceContact.java b/src/net/java/sip/communicator/impl/msghistory/MessageSourceContact.java
index e147344..1ade2f4 100644
--- a/src/net/java/sip/communicator/impl/msghistory/MessageSourceContact.java
+++ b/src/net/java/sip/communicator/impl/msghistory/MessageSourceContact.java
@@ -299,7 +299,7 @@
             = preferredProvider
                 .getOperationSet(OperationSetContactCapabilities.class);
         Map<String, OperationSet> opsetCapabilities = null;
-        if(capOpSet != null)
+        if(capOpSet != null && contact != null)
             opsetCapabilities = capOpSet.getSupportedOperationSets(contact);
 
         if (preferredProvider != null)
