diff --git a/grails-web-mvc/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/AbstractGrailsControllerHelper.java b/grails-web-mvc/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/AbstractGrailsControllerHelper.java
index aa95501..5f05044 100644
--- a/grails-web-mvc/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/AbstractGrailsControllerHelper.java
+++ b/grails-web-mvc/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/AbstractGrailsControllerHelper.java
@@ -463,7 +463,7 @@
 
     public void setServletContext(ServletContext servletContext) {
         this.servletContext = servletContext;
-        this.grailsAttributes = GrailsFactoriesLoader.loadFactories(GrailsApplicationAttributes.class, getClass().getClassLoader(), servletContext).get(0);
+        this.grailsAttributes = GrailsFactoriesLoader.loadFactoriesWithArguments(GrailsApplicationAttributes.class, getClass().getClassLoader(), servletContext).get(0);
     }
 
     public void setGrailsApplication(GrailsApplication application) {
