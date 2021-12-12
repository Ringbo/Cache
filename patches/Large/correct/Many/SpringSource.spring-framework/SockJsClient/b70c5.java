diff --git a/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/SockJsClient.java b/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/SockJsClient.java
index 72271dd..d1ebe24 100644
--- a/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/SockJsClient.java
+++ b/spring-websocket/src/main/java/org/springframework/web/socket/sockjs/client/SockJsClient.java
@@ -175,7 +175,7 @@
 
 	@Override
 	public void stop() {
-		if (!isRunning()) {
+		if (isRunning()) {
 			this.running = false;
 			for (Transport transport : this.transports) {
 				if (transport instanceof Lifecycle) {
