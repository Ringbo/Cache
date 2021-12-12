diff --git a/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketClient.java b/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketClient.java
index f71f4f2..cb979b9 100644
--- a/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketClient.java
+++ b/nifi-nar-bundles/nifi-websocket-bundle/nifi-websocket-services-jetty/src/test/java/org/apache/nifi/websocket/TestJettyWebSocketClient.java
@@ -35,7 +35,7 @@
         final Collection<ValidationResult> results = service.validate(context.getValidationContext());
         assertEquals(1, results.size());
         final ValidationResult result = results.iterator().next();
-        assertEquals(JettyWebSocketClient.WS_URI.getName(), result.getSubject());
+        assertEquals(JettyWebSocketClient.WS_URI.getDisplayName(), result.getSubject());
     }
 
     @Test
