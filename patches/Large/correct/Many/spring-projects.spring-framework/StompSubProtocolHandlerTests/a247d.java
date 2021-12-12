diff --git a/spring-websocket/src/test/java/org/springframework/web/socket/messaging/StompSubProtocolHandlerTests.java b/spring-websocket/src/test/java/org/springframework/web/socket/messaging/StompSubProtocolHandlerTests.java
index 5ba2217..5aaf112 100644
--- a/spring-websocket/src/test/java/org/springframework/web/socket/messaging/StompSubProtocolHandlerTests.java
+++ b/spring-websocket/src/test/java/org/springframework/web/socket/messaging/StompSubProtocolHandlerTests.java
@@ -183,7 +183,7 @@
 
 		this.protocolHandler.afterSessionEnded(this.session, CloseStatus.BAD_DATA, this.channel);
 
-		assertEquals(3, publisher.events.size());
+		assertEquals("Unexpected events " + publisher.events, 3, publisher.events.size());
 		assertEquals(SessionConnectEvent.class, publisher.events.get(0).getClass());
 		assertEquals(SessionConnectedEvent.class, publisher.events.get(1).getClass());
 		assertEquals(SessionDisconnectEvent.class, publisher.events.get(2).getClass());
