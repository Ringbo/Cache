diff --git a/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java b/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java
index 7a8cff8..7611652 100644
--- a/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java
+++ b/src/web/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java
@@ -46,7 +46,7 @@
 
 		this.request = request;
 		this.parameterMap = new HashMap();
-        final Map requestMap = new HashMap(request.getParameterMap());
+        final Map requestMap = new LinkedHashMap(request.getParameterMap());
         if(request instanceof MultipartHttpServletRequest) {
             MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
             Map fileMap = multipartRequest.getFileMap();
