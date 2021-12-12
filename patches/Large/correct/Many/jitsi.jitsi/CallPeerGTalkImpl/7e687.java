diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java
index 4e9f9fe..ce5767c 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerGTalkImpl.java
@@ -663,7 +663,7 @@
         if(idx != -1)
         {
             String res = fullJID.substring(idx + 1);
-            if(res.startsWith("android"))
+            if(res.startsWith("android") || res.startsWith("Vtok"))
             {
                 return true;
             }
