diff --git a/src/web/org/codehaus/groovy/grails/web/servlet/mvc/SimpleGrailsController.java b/src/web/org/codehaus/groovy/grails/web/servlet/mvc/SimpleGrailsController.java
index b0b4b84..d5f85be 100644
--- a/src/web/org/codehaus/groovy/grails/web/servlet/mvc/SimpleGrailsController.java
+++ b/src/web/org/codehaus/groovy/grails/web/servlet/mvc/SimpleGrailsController.java
@@ -77,9 +77,8 @@
 	 */
 	public ModelAndView handleRequest(HttpServletRequest request,
 			HttpServletResponse response) throws Exception {		
-		// Step 1: determine the name of the controller.
-		// This maps to a slash + the name of the controller.
-		String uri = this.urlPathHelper.getRequestUri(request);
+		// Step 1: determine the correct URI of the request.
+		String uri = this.urlPathHelper.getLookupPathForRequest(request);
 		
 		if (uri.indexOf("?") > -1) {
 			uri = uri.substring(0, uri.indexOf("?"));
