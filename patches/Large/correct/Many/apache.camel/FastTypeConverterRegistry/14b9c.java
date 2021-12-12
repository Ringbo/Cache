diff --git a/core/camel-base/src/main/java/org/apache/camel/impl/converter/FastTypeConverterRegistry.java b/core/camel-base/src/main/java/org/apache/camel/impl/converter/FastTypeConverterRegistry.java
index 0f297ac..97e6e47 100644
--- a/core/camel-base/src/main/java/org/apache/camel/impl/converter/FastTypeConverterRegistry.java
+++ b/core/camel-base/src/main/java/org/apache/camel/impl/converter/FastTypeConverterRegistry.java
@@ -76,7 +76,7 @@
             loadCoreTypeConverters();
             int core = typeMappings.size();
             // load type converters up front
-            log.info("Initializing fast TypeConverterRegistry - requires converters to be annotated with @Converter(loader = true)");
+            log.debug("Initializing FastTypeConverterRegistry - requires converters to be annotated with @Converter(loader = true)");
             loadTypeConverters();
             int additional = typeMappings.size() - core;
             // report how many type converters we have loaded
@@ -102,7 +102,7 @@
                 // report how many type converters we have loaded
                 if (additional > 0) {
                     log.info("Type converters loaded (fast: {}, scanned: {})", fast, additional);
-                    log.warn("Annotation scanning mode loaded {} type converters. Its recommended to migrate to @Converter(loader = true) for fast type converter mode.");
+                    log.warn("Annotation scanning mode loaded {} type converters. Its recommended to migrate to @Converter(loader = true) for fast type converter mode.", additional);
                 }
             } catch (Exception e) {
                 throw RuntimeCamelException.wrapRuntimeCamelException(e);
