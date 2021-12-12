diff --git a/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java b/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java
index 084ee00..d6ef736 100644
--- a/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java
+++ b/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java
@@ -99,7 +99,7 @@
 		}
 
 		for (WebExceptionHandler handler : this.exceptionHandlers) {
-			completion = completion.switchOnError(ex -> handler.handle(exchange, ex));
+			completion = completion.onErrorResume(ex -> handler.handle(exchange, ex));
 		}
 
 		return completion;
