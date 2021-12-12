diff --git a/src/java/org/jivesoftware/messenger/handler/IQBindHandler.java b/src/java/org/jivesoftware/messenger/handler/IQBindHandler.java
index 62779d4..b91e3b1 100644
--- a/src/java/org/jivesoftware/messenger/handler/IQBindHandler.java
+++ b/src/java/org/jivesoftware/messenger/handler/IQBindHandler.java
@@ -66,7 +66,7 @@
         Element child = reply.setChildElement("bind", "urn:ietf:params:xml:ns:xmpp-bind");
         // Check if the client specified a desired resource
         String resource = packet.getChildElement().elementTextTrim("resource");
-        if (resource == null && resource.length() == 0) {
+        if (resource == null || resource.length() == 0) {
             // None was defined so use the random generated resource
             resource = session.getAddress().getResource();
         }
