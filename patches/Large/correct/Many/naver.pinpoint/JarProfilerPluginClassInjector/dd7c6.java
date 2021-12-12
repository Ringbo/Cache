diff --git a/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JarProfilerPluginClassInjector.java b/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JarProfilerPluginClassInjector.java
index bafcb5c..1733f61 100644
--- a/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JarProfilerPluginClassInjector.java
+++ b/profiler/src/main/java/com/navercorp/pinpoint/profiler/instrument/JarProfilerPluginClassInjector.java
@@ -215,7 +215,7 @@
             }
         }
         if (logger.isInfoEnabled()) {
-            logger.debug("defineClass pluginClass:{} cl:{}", className, classLoader);
+            logger.info("defineClass pluginClass:{} cl:{}", className, classLoader);
         }
         final byte[] bytes = ct.toBytecode();
         return (Class<?>)DEFINE_CLASS.invoke(classLoader, ct.getName(), bytes, 0, bytes.length);
