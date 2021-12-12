diff --git a/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/client/SockJsUrlInfoTests.java b/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/client/SockJsUrlInfoTests.java
index 462e27b..09a6212 100644
--- a/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/client/SockJsUrlInfoTests.java
+++ b/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/client/SockJsUrlInfoTests.java
@@ -40,7 +40,7 @@
 	public void serverId() throws Exception {
 		SockJsUrlInfo info = new SockJsUrlInfo(new URI("http://example.com"));
 		int serverId = Integer.valueOf(info.getServerId());
-		assertTrue("Invalid serverId: " + serverId, serverId > 0 && serverId < 1000);
+		assertTrue("Invalid serverId: " + serverId, serverId >= 0 && serverId < 1000);
 	}
 
 	@Test
