diff --git a/src/web/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java b/src/web/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java
index 3b884c0..05678e0 100644
--- a/src/web/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java
+++ b/src/web/org/codehaus/groovy/grails/web/metaclass/RenderDynamicMethod.java
@@ -258,7 +258,7 @@
             ApplicationContext applicationContext = webRequest.getApplicationContext();
             GrailsPluginManager pluginManager = (GrailsPluginManager) applicationContext.getBean(GrailsPluginManager.BEAN_NAME);
             GrailsPlugin plugin = pluginManager.getGrailsPlugin(pluginName.toString());
-            if(plugin!=null) contextPath = plugin.getPluginPath();
+            if(plugin!=null && !plugin.isBasePlugin()) contextPath = plugin.getPluginPath();
         }
         return contextPath;
     }
