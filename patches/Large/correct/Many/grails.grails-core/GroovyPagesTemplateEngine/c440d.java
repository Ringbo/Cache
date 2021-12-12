diff --git a/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java b/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
index f239246..3012908 100644
--- a/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
+++ b/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
@@ -83,7 +83,7 @@
         boolean spillGroovy = showSource && request.getParameter("showSource") != null;
 
         PageMeta pageMeta = getPage(pageId, context,pageUrl, request.getServletPath(), spillGroovy);
-        return new GroovyPagesTemplate(context,request,response,pageMeta);  //To change body of implemented methods use File | Settings | File Templates.
+        return new GroovyPagesTemplate(context,request,response,pageMeta,spillGroovy);  //To change body of implemented methods use File | Settings | File Templates.
     }
 
 
@@ -206,6 +206,7 @@
     } // isPageNew()
 
     /**
+     * 
      * @author Graeme Rocher
      * @since 12-Jan-2006
      */
@@ -220,12 +221,13 @@
         public GroovyPagesTemplate(ServletContext context,
                                    HttpServletRequest request,
                                    HttpServletResponse response,
-                                   PageMeta pageMeta) {
+                                   PageMeta pageMeta,
+                                   boolean showSource) {
             this.request = request;
             this.response = response;
             this.context = context;
 
-            this.showSource = showSource && request.getParameter("showSource") != null;
+            this.showSource = showSource;
             this.pageMeta = pageMeta;
         }
 
@@ -240,6 +242,11 @@
         }
     }
 
+    /**
+     *
+     * @author Graeme Rocher
+     * @since 12-Jan-2006
+     */
         protected static class GroovyPageTemplateWritable implements Writable {
             private HttpServletResponse response;
             private HttpServletRequest request;
