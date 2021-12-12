diff --git a/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompBrokerRelayMessageHandler.java b/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompBrokerRelayMessageHandler.java
index 3462ec5..a4d1646 100644
--- a/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompBrokerRelayMessageHandler.java
+++ b/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompBrokerRelayMessageHandler.java
@@ -768,7 +768,7 @@
 		public ListenableFuture<Void> forward(final Message<?> message, final StompHeaderAccessor accessor) {
 			TcpConnection<byte[]> conn = this.tcpConnection;
 
-			if (!this.isStompConnected) {
+			if (!this.isStompConnected || conn == null) {
 				if (this.isRemoteClientSession) {
 					if (logger.isDebugEnabled()) {
 						logger.debug("TCP connection closed already, ignoring " +
