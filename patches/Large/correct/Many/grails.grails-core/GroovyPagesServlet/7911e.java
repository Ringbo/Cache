diff --git a/grails-web-gsp/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesServlet.java b/grails-web-gsp/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesServlet.java
index 0044952..1e0b853 100644
--- a/grails-web-gsp/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesServlet.java
+++ b/grails-web-gsp/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesServlet.java
@@ -109,7 +109,7 @@
         context.setAttribute(SERVLET_INSTANCE, this);
 
         final WebApplicationContext webApplicationContext = getWebApplicationContext();
-        grailsAttributes = GrailsFactoriesLoader.loadFactories(GrailsApplicationAttributes.class, getClass().getClassLoader(), context).get(0);
+        grailsAttributes = GrailsFactoriesLoader.loadFactoriesWithArguments(GrailsApplicationAttributes.class, getClass().getClassLoader(), context).get(0);
         webApplicationContext.getAutowireCapableBeanFactory().autowireBeanProperties(this, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
         groovyPagesTemplateEngine = webApplicationContext.getBean(GroovyPagesTemplateEngine.BEAN_ID,
                 GroovyPagesTemplateEngine.class);
