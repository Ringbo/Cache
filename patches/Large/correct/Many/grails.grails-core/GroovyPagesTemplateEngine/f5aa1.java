diff --git a/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java b/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
index 071bad3..5581f64 100644
--- a/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
+++ b/src/web/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateEngine.java
@@ -391,7 +391,7 @@
 
         Parse parse;
         try {
-            parse = new Parse(name, res.getFilename(), inputStream);
+            parse = new Parse(name, res.getDescription(), inputStream);
         } catch (IOException e) {
             throw new GroovyPagesException("I/O parsing Groovy page ["+(res != null ? res.getDescription() : name)+"]: " + e.getMessage(),e);
         }
