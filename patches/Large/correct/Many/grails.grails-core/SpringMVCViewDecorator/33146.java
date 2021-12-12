diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SpringMVCViewDecorator.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SpringMVCViewDecorator.java
index ac36fa7..8c37507 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SpringMVCViewDecorator.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/sitemesh/SpringMVCViewDecorator.java
@@ -61,7 +61,7 @@
         if (!response.isCommitted()) {
             boolean dispatched = false;
             try {
-                request.setAttribute(GrailsPageFilter.GSP_SITEMESH_PAGE, new GSPSitemeshPage(true));
+                request.setAttribute(GrailsPageFilter.GSP_SITEMESH_PAGE, new GSPSitemeshPage());
                 request.setAttribute(GrailsPageFilter.ALREADY_APPLIED_KEY, Boolean.TRUE);
                 try {
                     view.render(Collections.<String, Object>emptyMap(), request, response);
