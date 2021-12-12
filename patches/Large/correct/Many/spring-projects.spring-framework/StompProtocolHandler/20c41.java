diff --git a/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompProtocolHandler.java b/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompProtocolHandler.java
index 3efea2d..ef23b2d 100644
--- a/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompProtocolHandler.java
+++ b/spring-messaging/src/main/java/org/springframework/messaging/simp/stomp/StompProtocolHandler.java
@@ -185,10 +185,10 @@
 
 		Set<String> acceptVersions = connectHeaders.getAcceptVersion();
 		if (acceptVersions.contains("1.2")) {
-			connectedHeaders.setAcceptVersion("1.2");
+			connectedHeaders.setVersion("1.2");
 		}
 		else if (acceptVersions.contains("1.1")) {
-			connectedHeaders.setAcceptVersion("1.1");
+			connectedHeaders.setVersion("1.1");
 		}
 		else if (acceptVersions.isEmpty()) {
 			// 1.0
