diff --git a/spring-messaging/src/main/java/org/springframework/messaging/support/AbstractMessageChannel.java b/spring-messaging/src/main/java/org/springframework/messaging/support/AbstractMessageChannel.java
index c215646..37825c7 100644
--- a/spring-messaging/src/main/java/org/springframework/messaging/support/AbstractMessageChannel.java
+++ b/spring-messaging/src/main/java/org/springframework/messaging/support/AbstractMessageChannel.java
@@ -126,7 +126,7 @@
 			}
 			throw new MessageDeliveryException(message,"Failed to send message to " + this, ex);
 		}
-		catch (Error err) {
+		catch (Throwable err) {
 			MessageDeliveryException ex2 =
 					new MessageDeliveryException(message, "Failed to send message to " + this, err);
 			chain.triggerAfterSendCompletion(message, this, sent, ex2);
