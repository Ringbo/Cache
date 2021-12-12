diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateRenderer.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateRenderer.java
index 8d83de0..94154a2 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateRenderer.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPagesTemplateRenderer.java
@@ -191,7 +191,7 @@
                     scaffoldedtemplateName = scaffoldedtemplateName.substring(0, scaffoldedtemplateName.length()-4);
                 }
                 FastStringWriter sw = new FastStringWriter();
-                ReflectionUtils.invokeMethod(generateViewMethod, scaffoldingTemplateGenerator, domainClass, templateName, sw);
+                ReflectionUtils.invokeMethod(generateViewMethod, scaffoldingTemplateGenerator, domainClass, scaffoldedtemplateName, sw);
                 t = groovyPagesTemplateEngine.createTemplate(sw.toString(), uri);
             }
         }
