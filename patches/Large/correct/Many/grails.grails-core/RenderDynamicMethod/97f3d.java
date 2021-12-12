diff --git a/src/java/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java b/src/java/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java
index c8dbbc3..e44b995 100644
--- a/src/java/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java
+++ b/src/java/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java
@@ -116,7 +116,7 @@
             String text = arguments[0].toString();
             renderView = renderText(text, response);
         } else if (arguments[0] instanceof Closure) {
-            setContentType(response, TEXT_HTML, DEFAULT_ENCODING, true);
+            setContentType(response, TEXT_HTML, gspEncoding, true);
             Closure closure = (Closure) arguments[arguments.length - 1];
             renderView = renderMarkup(closure, response);
         } else if (arguments[0] instanceof Map) {
