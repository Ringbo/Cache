diff --git a/test/commons/org/codehaus/groovy/grails/plugins/DefaultGrailsPluginManagerTests.java b/test/commons/org/codehaus/groovy/grails/plugins/DefaultGrailsPluginManagerTests.java
index 3160999..85cd2ef 100644
--- a/test/commons/org/codehaus/groovy/grails/plugins/DefaultGrailsPluginManagerTests.java
+++ b/test/commons/org/codehaus/groovy/grails/plugins/DefaultGrailsPluginManagerTests.java
@@ -59,7 +59,7 @@
         //third depends on i18n
         assertNotNull(manager.getGrailsPlugin("third"));
         
-        assertEquals(5, pluginList.size());
+        assertEquals(6, pluginList.size());
 
 	}
 
