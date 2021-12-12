diff --git a/spring-websocket/src/main/java/org/springframework/web/socket/messaging/StompSubProtocolHandler.java b/spring-websocket/src/main/java/org/springframework/web/socket/messaging/StompSubProtocolHandler.java
index f68ec4f..ad68b0f 100644
--- a/spring-websocket/src/main/java/org/springframework/web/socket/messaging/StompSubProtocolHandler.java
+++ b/spring-websocket/src/main/java/org/springframework/web/socket/messaging/StompSubProtocolHandler.java
@@ -187,7 +187,7 @@
 
 				message = MessageBuilder.withPayload(message.getPayload()).setHeaders(headers).build();
 
-				if (this.eventPublisher != null && StompCommand.CONNECT.equals(headers.getMessageType())) {
+				if (this.eventPublisher != null && StompCommand.CONNECT.equals(headers.getCommand())) {
 					publishEvent(new SessionConnectEvent(this, message));
 				}
 
@@ -265,7 +265,7 @@
 		try {
 			message = MessageBuilder.withPayload(message.getPayload()).setHeaders(headers).build();
 
-			if (this.eventPublisher != null && StompCommand.CONNECTED.equals(headers.getMessageType())) {
+			if (this.eventPublisher != null && StompCommand.CONNECTED.equals(headers.getCommand())) {
 				publishEvent(new SessionConnectedEvent(this, (Message<byte[]>) message));
 			}
 
