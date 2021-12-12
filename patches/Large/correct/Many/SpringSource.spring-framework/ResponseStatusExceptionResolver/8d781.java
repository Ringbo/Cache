diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/annotation/ResponseStatusExceptionResolver.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/annotation/ResponseStatusExceptionResolver.java
index 674c039..d854fc4 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/annotation/ResponseStatusExceptionResolver.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/annotation/ResponseStatusExceptionResolver.java
@@ -101,7 +101,7 @@
 			reason = this.messageSource.getMessage(reason, null, reason, LocaleContextHolder.getLocale());
 		}
 		if (!StringUtils.hasLength(reason)) {
-			response.sendError(statusCode);
+			response.setStatus(statusCode);
 		}
 		else {
 			response.sendError(statusCode, reason);
