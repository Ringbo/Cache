diff --git a/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/protocols/oscar/OSCARSession.java b/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/protocols/oscar/OSCARSession.java
index 86fc9f7..a83985d 100644
--- a/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/protocols/oscar/OSCARSession.java
+++ b/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/protocols/oscar/OSCARSession.java
@@ -472,7 +472,7 @@
             if (verboseStatus != null) {
                 awayMsg = verboseStatus;
             }
-            request(new SetInfoCmd(new InfoData(awayMsg, null, MY_CAPS, null)));
+            request(new SetInfoCmd(new InfoData(null, awayMsg, MY_CAPS, null)));
             Presence p = new Presence();
             p.setShow(Presence.Show.away);
             p.setTo(getJID());
@@ -480,7 +480,7 @@
             getTransport().sendPacket(p);
         }
         else {
-            request(new SetInfoCmd(new InfoData(InfoData.NOT_AWAY, null, MY_CAPS, null)));
+            request(new SetInfoCmd(new InfoData(null, InfoData.NOT_AWAY, MY_CAPS, null)));
             Presence p = new Presence();
             p.setTo(getJID());
             p.setFrom(getTransport().getJID());
