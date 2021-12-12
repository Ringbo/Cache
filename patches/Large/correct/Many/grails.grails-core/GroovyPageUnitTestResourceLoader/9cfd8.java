diff --git a/grails-plugin-testing/src/main/groovy/grails/test/mixin/support/GroovyPageUnitTestResourceLoader.java b/grails-plugin-testing/src/main/groovy/grails/test/mixin/support/GroovyPageUnitTestResourceLoader.java
index 92a4c3f..61bcc75 100644
--- a/grails-plugin-testing/src/main/groovy/grails/test/mixin/support/GroovyPageUnitTestResourceLoader.java
+++ b/grails-plugin-testing/src/main/groovy/grails/test/mixin/support/GroovyPageUnitTestResourceLoader.java
@@ -39,7 +39,7 @@
         }
         if (groovyPages.containsKey(location)) {
             try {
-                return new ByteArrayResource(groovyPages.get(location).getBytes("UTF-8"));
+                return new ByteArrayResource(groovyPages.get(location).getBytes("UTF-8"), location);
             } catch (UnsupportedEncodingException e) {
                 // continue
             }
