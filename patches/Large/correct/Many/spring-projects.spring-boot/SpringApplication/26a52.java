diff --git a/spring-boot/src/main/java/org/springframework/boot/SpringApplication.java b/spring-boot/src/main/java/org/springframework/boot/SpringApplication.java
index b307ace..147239f 100644
--- a/spring-boot/src/main/java/org/springframework/boot/SpringApplication.java
+++ b/spring-boot/src/main/java/org/springframework/boot/SpringApplication.java
@@ -330,7 +330,7 @@
 			}
 			return context;
 		}
-		catch (Exception ex) {
+		catch (Throwable ex) {
 			try {
 				for (SpringApplicationRunListener runListener : runListeners) {
 					finishWithException(runListener, context, ex);
@@ -696,7 +696,7 @@
 	}
 
 	private void finishWithException(SpringApplicationRunListener runListener,
-			ConfigurableApplicationContext context, Exception exception) {
+			ConfigurableApplicationContext context, Throwable exception) {
 		try {
 			runListener.finished(context, exception);
 		}
