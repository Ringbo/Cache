diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java
index 24ee50d..48e344b 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/extensions/colibri/ColibriConferenceIQ.java
@@ -1077,8 +1077,8 @@
 
             if (adaptiveSimulcast != null)
             {
-                xml.append(' ').append(adaptiveSimulcast).append("='")
-                        .append(adaptiveSimulcast).append('\'');
+                xml.append(' ').append(ADAPTIVE_SIMULCAST_ATTR_NAME)
+                        .append("='").append(adaptiveSimulcast).append('\'');
             }
 
             // simulcastMode
