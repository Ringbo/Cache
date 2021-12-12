diff --git a/spring-messaging/src/main/java/org/springframework/messaging/support/ExecutorSubscribableChannel.java b/spring-messaging/src/main/java/org/springframework/messaging/support/ExecutorSubscribableChannel.java
index 611cdf0..45acbbf 100644
--- a/spring-messaging/src/main/java/org/springframework/messaging/support/ExecutorSubscribableChannel.java
+++ b/spring-messaging/src/main/java/org/springframework/messaging/support/ExecutorSubscribableChannel.java
@@ -143,7 +143,7 @@
 				String description = "Failed to handle " + message + " to " + this + " in " + this.messageHandler;
 				throw new MessageDeliveryException(message, description, ex);
 			}
-			catch (Error err) {
+			catch (Throwable err) {
 				String description = "Failed to handle " + message + " to " + this + " in " + this.messageHandler;
 				MessageDeliveryException ex2 = new MessageDeliveryException(message, description, err);
 				triggerAfterMessageHandled(message, ex2);
