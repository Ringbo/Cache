diff --git a/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutView.java b/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutView.java
index 3135da8..96bd858 100644
--- a/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutView.java
+++ b/grails-web-sitemesh/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutView.java
@@ -57,7 +57,7 @@
             beforeDecorating(content, model, webRequest, request, response);
             SpringMVCViewDecorator decorator = (SpringMVCViewDecorator)groovyPageLayoutFinder.findLayout(request, content);
             if(decorator != null) {
-                decorator.render(content, model, request, response, request.getServletContext());
+                decorator.render(content, model, request, response, webRequest.getServletContext());
             } else {
                 PrintWriter writer = response.getWriter();
                 content.writeOriginal(writer);
