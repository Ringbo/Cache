diff --git a/smack-core/src/main/java/org/jivesoftware/smack/SASLAuthentication.java b/smack-core/src/main/java/org/jivesoftware/smack/SASLAuthentication.java
index ca11f21..024a7ef 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/SASLAuthentication.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/SASLAuthentication.java
@@ -203,7 +203,7 @@
             final long deadline = System.currentTimeMillis() + connection.getPacketReplyTimeout();
             while (!authenticationSuccessful && saslException == null) {
                 final long now = System.currentTimeMillis();
-                if (now > deadline) break;
+                if (now >= deadline) break;
                 // Wait until SASL negotiation finishes
                 wait(deadline - now);
             }
