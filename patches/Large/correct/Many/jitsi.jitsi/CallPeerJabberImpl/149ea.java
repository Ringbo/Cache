diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerJabberImpl.java
index 1039605..c6d2524 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerJabberImpl.java
@@ -948,7 +948,7 @@
         }
         else
         {
-            if(senders == SendersEnum.both)
+            if(senders == SendersEnum.both || senders == null)
             {
                 senders
                     = isInitiator
