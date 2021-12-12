diff --git a/src/core/org/apache/jmeter/save/converters/SampleResultConverter.java b/src/core/org/apache/jmeter/save/converters/SampleResultConverter.java
index a5d060e..cc8b89e 100644
--- a/src/core/org/apache/jmeter/save/converters/SampleResultConverter.java
+++ b/src/core/org/apache/jmeter/save/converters/SampleResultConverter.java
@@ -42,7 +42,7 @@
  */
 public class SampleResultConverter extends AbstractCollectionConverter
 {
-   private static Logger log = LoggingManager.getLoggerForClass();
+   private static final Logger log = LoggingManager.getLoggerForClass();
 
    /**
     * Returns the converter version; used to check for possible
@@ -92,7 +92,7 @@
    protected void saveSamplerData(HierarchicalStreamWriter writer,
          SampleResult res, SampleSaveConfiguration save)
    {
-      if (save.saveSamplerData())
+      if (save.saveSamplerData(res))
       {
          writeString(writer, "samplerData", res.getSamplerData());
       }
