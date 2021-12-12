diff --git a/smack-bosh/src/main/java/org/jivesoftware/smack/bosh/XMPPBOSHConnection.java b/smack-bosh/src/main/java/org/jivesoftware/smack/bosh/XMPPBOSHConnection.java
index 4d85da2..1e48c72 100644
--- a/smack-bosh/src/main/java/org/jivesoftware/smack/bosh/XMPPBOSHConnection.java
+++ b/smack-bosh/src/main/java/org/jivesoftware/smack/bosh/XMPPBOSHConnection.java
@@ -185,7 +185,7 @@
                 final long deadline = System.currentTimeMillis() + getPacketReplyTimeout();
                 while (!notified) {
                     final long now = System.currentTimeMillis();
-                    if (now > deadline) break;
+                    if (now >= deadline) break;
                     wait(deadline - now);
                 }
             }
