diff --git a/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java b/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java
index f206244..95c0fc4 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java
@@ -1134,7 +1134,7 @@
             if(request.getMethod().equals(Request.NOTIFY)
                && request.getHeader(SubscriptionStateHeader.NAME) == null)
             {
-                return false;
+                return true;
             }
         }
         catch(Throwable ex)
