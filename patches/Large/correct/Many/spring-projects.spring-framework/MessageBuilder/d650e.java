diff --git a/spring-context/src/main/java/org/springframework/messaging/support/MessageBuilder.java b/spring-context/src/main/java/org/springframework/messaging/support/MessageBuilder.java
index 2790951..3c9b5ed 100644
--- a/spring-context/src/main/java/org/springframework/messaging/support/MessageBuilder.java
+++ b/spring-context/src/main/java/org/springframework/messaging/support/MessageBuilder.java
@@ -34,7 +34,7 @@
 
 	private final T payload;
 
-	private final MessageHeaderAccesssor headerAccessor;
+	private final MessageHeaderAccessor headerAccessor;
 
 	private final Message<T> originalMessage;
 
@@ -46,7 +46,7 @@
 		Assert.notNull(payload, "payload must not be null");
 		this.payload = payload;
 		this.originalMessage = originalMessage;
-		this.headerAccessor = new MessageHeaderAccesssor(originalMessage);
+		this.headerAccessor = new MessageHeaderAccessor(originalMessage);
 	}
 
 	/**
