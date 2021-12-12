diff --git a/spring-web-reactive/src/test/java/org/springframework/http/server/reactive/ChannelSendOperatorTests.java b/spring-web-reactive/src/test/java/org/springframework/http/server/reactive/ChannelSendOperatorTests.java
index c65fe4f..7db972e 100644
--- a/spring-web-reactive/src/test/java/org/springframework/http/server/reactive/ChannelSendOperatorTests.java
+++ b/spring-web-reactive/src/test/java/org/springframework/http/server/reactive/ChannelSendOperatorTests.java
@@ -110,7 +110,7 @@
 		IllegalStateException error = new IllegalStateException("boo");
 		Flux<String> publisher = Flux.generate(() -> 0, (idx , subscriber) -> {
 			int i = ++idx;
-			subscriber.tryEmit(String.valueOf(i));
+			subscriber.next(String.valueOf(i));
 			if (i == 3) {
 				subscriber.fail(error);
 			}
