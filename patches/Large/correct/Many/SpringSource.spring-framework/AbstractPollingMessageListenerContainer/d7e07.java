diff --git a/org.springframework.jms/src/main/java/org/springframework/jms/listener/AbstractPollingMessageListenerContainer.java b/org.springframework.jms/src/main/java/org/springframework/jms/listener/AbstractPollingMessageListenerContainer.java
index af0c0f8..cd7bcaa 100644
--- a/org.springframework.jms/src/main/java/org/springframework/jms/listener/AbstractPollingMessageListenerContainer.java
+++ b/org.springframework.jms/src/main/java/org/springframework/jms/listener/AbstractPollingMessageListenerContainer.java
@@ -351,7 +351,7 @@
 				}
 				noMessageReceived(invoker, sessionToUse);
 				// Nevertheless call commit, in order to reset the transaction timeout (if any).
-				commitIfNecessary(session, message);
+				commitIfNecessary(sessionToUse, message);
 				// Indicate that no message has been received.
 				return false;
 			}
