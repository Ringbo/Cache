diff --git a/src/java/org/jivesoftware/wildfire/audit/spi/AuditorImpl.java b/src/java/org/jivesoftware/wildfire/audit/spi/AuditorImpl.java
index 7ba6b34..9c45bc4 100644
--- a/src/java/org/jivesoftware/wildfire/audit/spi/AuditorImpl.java
+++ b/src/java/org/jivesoftware/wildfire/audit/spi/AuditorImpl.java
@@ -381,10 +381,10 @@
         public AuditPacket(Packet packet, Session session) {
             element = docFactory.createElement("packet", "http://www.jivesoftware.org");
             creationDate = new Date();
-            if (session.getStreamID() != null) {
+            if (session != null && session.getStreamID() != null) {
                 element.addAttribute("streamID", session.getStreamID().toString());
             }
-            switch (session.getStatus()) {
+            switch (session == null ? 0 : session.getStatus()) {
                 case Session.STATUS_AUTHENTICATED:
                     element.addAttribute("status", "auth");
                     break;
