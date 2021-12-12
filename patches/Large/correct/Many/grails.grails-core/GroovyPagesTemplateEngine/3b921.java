diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
index 1d7889c..9421d54 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
@@ -655,7 +655,7 @@
     }
 
     private synchronized GroovyClassLoader findOrInitGroovyClassLoader() {
-        if (!(classLoader instanceof GroovyClassLoader)) {
+        if (!(classLoader instanceof GroovyPageClassLoader)) {
             classLoader = initGroovyClassLoader(classLoader);
         }
         return (GroovyClassLoader)classLoader;
