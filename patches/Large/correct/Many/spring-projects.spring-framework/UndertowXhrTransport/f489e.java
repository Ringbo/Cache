diff --git a/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/UndertowXhrTransport.java b/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/UndertowXhrTransport.java
index 49e8981..863059a 100644
--- a/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/UndertowXhrTransport.java
+++ b/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/UndertowXhrTransport.java
@@ -588,7 +588,7 @@
 		public void httpClientConnect(UndertowClient httpClient, ClientCallback<ClientConnection> listener, URI uri,
 				XnioWorker worker, OptionMap options) {
 			ReflectionUtils.invokeMethod(httpClientConnectCallbackMethod, httpClient, listener, uri,
-					this.undertowBufferPool, worker, options);
+					worker, this.undertowBufferPool, options);
 		}
 
 		@Override
