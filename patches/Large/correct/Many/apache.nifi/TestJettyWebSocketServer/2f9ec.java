diff --git a/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketServer.java b/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketServer.java
index 4cd17f6..907e689 100644
--- a/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketServer.java
+++ b/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketServer.java
@@ -35,7 +35,7 @@
         final Collection<ValidationResult> results = service.validate(context.getValidationContext());
         assertEquals(1, results.size());
         final ValidationResult result = results.iterator().next();
-        assertEquals(JettyWebSocketServer.LISTEN_PORT.getName(), result.getSubject());
+        assertEquals(JettyWebSocketServer.LISTEN_PORT.getDisplayName(), result.getSubject());
     }
 
     @Test
