diff --git a/spring-boot/src/main/java/org/springframework/boot/context/web/ErrorPageFilter.java b/spring-boot/src/main/java/org/springframework/boot/context/web/ErrorPageFilter.java
index 1f58bf8..e31ac84 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/web/ErrorPageFilter.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/web/ErrorPageFilter.java
@@ -136,18 +136,18 @@
 		request.setAttribute(ERROR_EXCEPTION, ex);
 		request.setAttribute(ERROR_EXCEPTION_TYPE, type.getName());
 		wrapped.sendError(500, ex.getMessage());
-		forwardToErrorPage(errorPath, request, wrapped);
+		forwardToErrorPage(errorPath, request, wrapped, ex);
 	}
 
 	private void forwardToErrorPage(String path, HttpServletRequest request,
-			ServletResponse response) throws ServletException, IOException {
+			ServletResponse response, Throwable ex) throws ServletException, IOException {
 		if (!response.isCommitted()) {
 			String message = "Cannot forward to error page for" + request.getRequestURI()
 					+ " (response is committed), so this response may have "
 					+ "the wrong status code";
-			// User might see the error page without all the data here but the exception
-			// isn't going to help anyone (and it's already been logged)
-			logger.error(message);
+			// User might see the error page without all the data here but throwing the
+			// exception isn't going to help anyone (we'll log it to be on the safe side)
+			logger.error(message, ex);
 			return;
 		}
 		response.reset();
