diff --git a/spring-web/src/main/java/org/springframework/web/method/annotation/ExceptionHandlerMethodResolver.java b/spring-web/src/main/java/org/springframework/web/method/annotation/ExceptionHandlerMethodResolver.java
index 84558dd..eac5de7 100644
--- a/spring-web/src/main/java/org/springframework/web/method/annotation/ExceptionHandlerMethodResolver.java
+++ b/spring-web/src/main/java/org/springframework/web/method/annotation/ExceptionHandlerMethodResolver.java
@@ -125,7 +125,7 @@
 	 * @return a Method to handle the exception, or {@code null} if none found
 	 */
 	public Method resolveMethod(Exception exception) {
-		return resolveMethod(exception);
+		return resolveMethodByThrowable(exception);
 	}
 
 	/**
