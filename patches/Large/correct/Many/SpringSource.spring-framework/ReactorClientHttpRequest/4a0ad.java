diff --git a/spring-web-reactive/src/main/java/org/springframework/http/client/reactive/ReactorClientHttpRequest.java b/spring-web-reactive/src/main/java/org/springframework/http/client/reactive/ReactorClientHttpRequest.java
index b288f72..6ab0654 100644
--- a/spring-web-reactive/src/main/java/org/springframework/http/client/reactive/ReactorClientHttpRequest.java
+++ b/spring-web-reactive/src/main/java/org/springframework/http/client/reactive/ReactorClientHttpRequest.java
@@ -118,7 +118,7 @@
 									return channel.send(body);
 								}
 								else {
-									return channel.writeHeaders();
+									return channel.sendHeaders();
 								}
 							});
 				})
