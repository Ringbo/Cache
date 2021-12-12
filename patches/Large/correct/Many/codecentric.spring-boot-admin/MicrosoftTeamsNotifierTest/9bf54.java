diff --git a/spring-boot-admin-server/src/test/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifierTest.java b/spring-boot-admin-server/src/test/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifierTest.java
index 518d901..b859fc3 100644
--- a/spring-boot-admin-server/src/test/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifierTest.java
+++ b/spring-boot-admin-server/src/test/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifierTest.java
@@ -51,7 +51,7 @@
 
 		notifier.doNotify(event);
 
-		verify(mockRestTemplate).postForObject(eq(URI.create("http://example.com")),
+		verify(mockRestTemplate).postForEntity(eq(URI.create("http://example.com")),
 				any(Message.class), eq(Void.class));
 	}
 
@@ -61,7 +61,7 @@
 
 		notifier.doNotify(event);
 
-		verify(mockRestTemplate).postForObject(eq(URI.create("http://example.com")),
+		verify(mockRestTemplate).postForEntity(eq(URI.create("http://example.com")),
 				any(Message.class), eq(Void.class));
 	}
 
@@ -72,7 +72,7 @@
 
 		notifier.doNotify(event);
 
-		verify(mockRestTemplate).postForObject(eq(URI.create("http://example.com")),
+		verify(mockRestTemplate).postForEntity(eq(URI.create("http://example.com")),
 				any(Message.class), eq(Void.class));
 	}
 
