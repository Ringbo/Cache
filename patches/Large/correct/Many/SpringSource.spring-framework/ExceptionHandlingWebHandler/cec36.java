diff --git a/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java b/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java
index 1d1774b..084ee00 100644
--- a/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java
+++ b/spring-web/src/main/java/org/springframework/web/server/handler/ExceptionHandlingWebHandler.java
@@ -99,7 +99,7 @@
 		}
 
 		for (WebExceptionHandler handler : this.exceptionHandlers) {
-			completion = completion.otherwise(ex -> handler.handle(exchange, ex));
+			completion = completion.switchOnError(ex -> handler.handle(exchange, ex));
 		}
 
 		return completion;
