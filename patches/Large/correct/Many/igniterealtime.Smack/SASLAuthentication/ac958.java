diff --git a/source/org/jivesoftware/smack/SASLAuthentication.java b/source/org/jivesoftware/smack/SASLAuthentication.java
index 2f6304a..45eedd8 100644
--- a/source/org/jivesoftware/smack/SASLAuthentication.java
+++ b/source/org/jivesoftware/smack/SASLAuthentication.java
@@ -188,8 +188,10 @@
                 Constructor constructor = selected
                         .getConstructor(new Class[]{SASLAuthentication.class});
                 currentMechanism = (SASLMechanism) constructor.newInstance(new Object[]{this});
-                // Trigger SASL authentication with the selected mechanism
-                currentMechanism.authenticate(username, connection.getServiceName(), password);
+                // Trigger SASL authentication with the selected mechanism. We use
+                // connection.getHost() since GSAPI requires the FQDN of the server, which
+                // may not match the XMPP domain.
+                currentMechanism.authenticate(username, connection.getHost(), password);
 
                 // Wait until SASL negotiation finishes
                 synchronized (this) {
