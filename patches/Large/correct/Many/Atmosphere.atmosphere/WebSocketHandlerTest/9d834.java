diff --git a/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketHandlerTest.java b/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketHandlerTest.java
index 1d3441b..c132326 100644
--- a/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketHandlerTest.java
+++ b/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketHandlerTest.java
@@ -92,7 +92,7 @@
         processor.registerWebSocketHandler("/*", new EchoHandler());
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().destroyable(false).body("yoComet").pathInfo("/a").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w, "yoWebSocket");
 
         assertEquals(b.toString(), "yoWebSocket");
@@ -108,7 +108,7 @@
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().destroyable(false).body("yoComet").pathInfo("/abcd").build();
         try {
-            processor.open(w, request);
+            processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
             fail();
         } catch (Exception ex) {
             assertEquals(ex.getClass(), AtmosphereMappingException.class);
@@ -126,13 +126,13 @@
         processor.registerWebSocketHandler("/b", new EchoHandler());
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().destroyable(false).body("a").pathInfo("/a").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w, "a");
 
         assertEquals(b.toString(), "a");
 
         request = new AtmosphereRequest.Builder().destroyable(false).body("b").pathInfo("/b").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w, "b");
 
         // The WebSocketHandler is shared.
@@ -155,14 +155,14 @@
         });
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().destroyable(false).body("a").pathInfo("/a").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w, "a");
 
         assertEquals(b.toString(), "a");
         ByteArrayOutputStream b2 = new ByteArrayOutputStream();
         final WebSocket w2 = new ArrayBaseWebSocket(b2);
         request = new AtmosphereRequest.Builder().destroyable(false).body("b").pathInfo("/b").build();
-        processor.open(w2, request);
+        processor.open(w2, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w2, "b");
 
         // The WebSocketHandler is shared.
