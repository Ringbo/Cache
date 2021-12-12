diff --git a/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SitemeshLayoutView.java b/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SitemeshLayoutView.java
index 6bc345d..baee4f0 100644
--- a/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SitemeshLayoutView.java
+++ b/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SitemeshLayoutView.java
@@ -37,6 +37,6 @@
     @Override
     protected GrailsContentBufferingResponse createContentBufferingResponse(Map<String, Object> model,
             GrailsWebRequest webRequest, HttpServletRequest request, HttpServletResponse response) {
-        return new GrailsContentBufferingResponse(response, contentProcessor, new SiteMeshWebAppContext(request, response, request.getServletContext()));
+        return new GrailsContentBufferingResponse(response, contentProcessor, new SiteMeshWebAppContext(request, response, webRequest.getServletContext()));
     }
 }
