diff --git a/src/java/org/jivesoftware/wildfire/multiplex/ConnectionMultiplexerSession.java b/src/java/org/jivesoftware/wildfire/multiplex/ConnectionMultiplexerSession.java
index 28b6f63..4ca00ef 100644
--- a/src/java/org/jivesoftware/wildfire/multiplex/ConnectionMultiplexerSession.java
+++ b/src/java/org/jivesoftware/wildfire/multiplex/ConnectionMultiplexerSession.java
@@ -285,7 +285,7 @@
         // Add info about TLS
         if (ClientSession.getTLSPolicy() != Connection.TLSPolicy.disabled) {
             Element tls = child.addElement("starttls", "urn:ietf:params:xml:ns:xmpp-tls");
-            if (ClientSession.getTLSPolicy() != Connection.TLSPolicy.required) {
+            if (ClientSession.getTLSPolicy() == Connection.TLSPolicy.required) {
                 tls.addElement("required");
             }
 
