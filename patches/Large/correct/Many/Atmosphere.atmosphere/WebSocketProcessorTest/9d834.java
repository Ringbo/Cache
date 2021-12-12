diff --git a/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketProcessorTest.java b/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketProcessorTest.java
index 5c16b7e..12241d2 100644
--- a/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketProcessorTest.java
+++ b/modules/cpr/src/test/java/org/atmosphere/cpr/WebSocketProcessorTest.java
@@ -107,7 +107,7 @@
         });
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().destroyable(false).body("yoComet").pathInfo("/a").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w, "yoWebSocket");
         BroadcasterFactory.getDefault().lookup("/*").broadcast("yoBroadcast").get();
 
@@ -146,7 +146,7 @@
         c.add(new Cookie("yo", "man"));
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().cookies(c).pathInfo("/a").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
 
         r.get().getBroadcaster().broadcast("yo").get();
         assertNotNull(cValue.get());
@@ -186,7 +186,7 @@
         });
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().destroyable(false).body("yoComet").pathInfo("/a").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w, "yoWebSocket");
         processor.notifyListener(w, new WebSocketEventListener.WebSocketEvent("Disconnect", DISCONNECT, w));
 
@@ -224,7 +224,7 @@
         });
 
         AtmosphereRequest request = new AtmosphereRequest.Builder().destroyable(false).body("yoComet").pathInfo("/a").build();
-        processor.open(w, request);
+        processor.open(w, request, AtmosphereResponse.newInstance(framework.getAtmosphereConfig(), request, w));
         processor.invokeWebSocketProtocol(w, "yoWebSocket");
         processor.notifyListener(w, new WebSocketEventListener.WebSocketEvent("Close", WebSocketEventListener.WebSocketEvent.TYPE.CLOSE, w));
 
