diff --git a/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java b/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java
index b17a201..3b94d87 100644
--- a/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java
+++ b/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java
@@ -43,7 +43,7 @@
         assertEquals(2, grailsApplicationAwares.size());
 
         Map classLoaderAwares = appCtx.getBeansOfType(ClassLoaderAware.class);
-        assertEquals(2, classLoaderAwares.size());
+        assertEquals(1, classLoaderAwares.size());
     }
 
     public void testTestBeanGetClass() {
