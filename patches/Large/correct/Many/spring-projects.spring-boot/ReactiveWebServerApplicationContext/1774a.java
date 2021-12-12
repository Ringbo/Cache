diff --git a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/reactive/context/ReactiveWebServerApplicationContext.java b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/reactive/context/ReactiveWebServerApplicationContext.java
index 75e5af0..fddab18 100644
--- a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/reactive/context/ReactiveWebServerApplicationContext.java
+++ b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/reactive/context/ReactiveWebServerApplicationContext.java
@@ -227,14 +227,14 @@
 
 		public static void start(ServerManager manager,
 				Supplier<HttpHandler> handlerSupplier) {
-			if (manager != null) {
+			if (manager != null && manager.server != null) {
 				manager.handler = handlerSupplier.get();
 				manager.server.start();
 			}
 		}
 
 		public static void stop(ServerManager manager) {
-			if (manager != null) {
+			if (manager != null && manager.server != null) {
 				try {
 					manager.server.stop();
 				}
