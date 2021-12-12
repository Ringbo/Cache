diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/ContactJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/ContactJabberImpl.java
index 7ce5350..f29bf9c 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/ContactJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/ContactJabberImpl.java
@@ -130,7 +130,8 @@
     {
         if (obj == null
             || !(obj instanceof ContactJabberImpl)
-            || !(((ContactJabberImpl)obj).getAddress().equals(getAddress())
+            || !(((ContactJabberImpl)obj).getAddress()
+                                            .equalsIgnoreCase(getAddress())
                 && ((ContactJabberImpl)obj).getProtocolProvider()
                         == getProtocolProvider()))
 
