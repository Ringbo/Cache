diff --git a/src/net/java/sip/communicator/impl/protocol/sip/OperationSetPresenceSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/OperationSetPresenceSipImpl.java
index e6b100a..7162a67 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/OperationSetPresenceSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/OperationSetPresenceSipImpl.java
@@ -1012,7 +1012,7 @@
                IllegalStateException,
                OperationFailedException
     {
-        this.subscribe(parentGroup, contactIdentifier);
+        this.subscribe(parentGroup, contactIdentifier, null);
     }
 
     /**
