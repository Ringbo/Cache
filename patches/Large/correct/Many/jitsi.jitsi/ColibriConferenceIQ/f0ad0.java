diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java
index 52368bf..24ee50d 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java
@@ -161,7 +161,7 @@
             throw new NullPointerException("channelBundle");
 
         return
-            channelBundles.contains(channelBundles)
+            channelBundles.contains(channelBundle)
                ? false
                : channelBundles.add(channelBundle);
     }
