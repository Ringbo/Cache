diff --git a/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsWebRequestFilter.java b/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsWebRequestFilter.java
index dcd4d00..be0e7c7 100644
--- a/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsWebRequestFilter.java
+++ b/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsWebRequestFilter.java
@@ -44,13 +44,13 @@
 			throws ServletException, IOException {
 
 		LocaleContextHolder.setLocale(request.getLocale());
-		GrailsWebRequest requestAttributes = new GrailsWebRequest(request, response, getServletContext());
+		ServletRequestAttributes requestAttributes = new GrailsWebRequest(request, response, getServletContext());
 		RequestContextHolder.setRequestAttributes(requestAttributes);
 		if (logger.isDebugEnabled()) {
 			logger.debug("Bound Grails request context to thread: " + request);
 		}
 		try {
-			filterChain.doFilter(requestAttributes.getCurrentRequest(), requestAttributes.getCurrentResponse());
+			filterChain.doFilter(request, response);
 		}
 		finally {
 			requestAttributes.requestCompleted();
