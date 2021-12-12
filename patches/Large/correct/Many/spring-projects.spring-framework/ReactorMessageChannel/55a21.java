diff --git a/spring-websocket/src/main/java/org/springframework/web/messaging/support/ReactorMessageChannel.java b/spring-websocket/src/main/java/org/springframework/web/messaging/support/ReactorMessageChannel.java
index 304cc04..318c34c 100644
--- a/spring-websocket/src/main/java/org/springframework/web/messaging/support/ReactorMessageChannel.java
+++ b/spring-websocket/src/main/java/org/springframework/web/messaging/support/ReactorMessageChannel.java
@@ -104,7 +104,7 @@
 			logger.trace("Channel " + getName() + ", removing subscription for handler " + handler);
 		}
 
-		Registration<?> registration = this.registrations.get(handler);
+		Registration<?> registration = this.registrations.remove(handler);
 		if (registration == null) {
 			if (logger.isTraceEnabled()) {
 				logger.trace("Channel " + getName() + ", no subscription for handler " + handler);
