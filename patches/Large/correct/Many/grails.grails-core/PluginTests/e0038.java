diff --git a/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java b/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java
index 9920608..b17a201 100644
--- a/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java
+++ b/test/commons/org/codehaus/groovy/grails/plugins/PluginTests.java
@@ -40,7 +40,7 @@
 
     public void testAwareBeanPostProcessorsAreRegistered() {
         Map grailsApplicationAwares = appCtx.getBeansOfType(GrailsApplicationAware.class);
-        assertEquals(3, grailsApplicationAwares.size());
+        assertEquals(2, grailsApplicationAwares.size());
 
         Map classLoaderAwares = appCtx.getBeansOfType(ClassLoaderAware.class);
         assertEquals(2, classLoaderAwares.size());
