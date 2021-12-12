diff --git a/src/java/org/jivesoftware/openfire/IQRouter.java b/src/java/org/jivesoftware/openfire/IQRouter.java
index a697ef1..8839e72 100644
--- a/src/java/org/jivesoftware/openfire/IQRouter.java
+++ b/src/java/org/jivesoftware/openfire/IQRouter.java
@@ -255,7 +255,7 @@
                     namespace = childElement.getNamespaceURI();
                 }
                 if (namespace == null) {
-                    if (packet.getType() != IQ.Type.result) {
+                    if (packet.getType() != IQ.Type.result && packet.getType() != IQ.Type.error) {
                         // Do nothing. We can't handle queries outside of a valid namespace
                         Log.warn("Unknown packet " + packet);
                     }
