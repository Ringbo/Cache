diff --git a/src/core/org/apache/jmeter/report/processor/Top5ErrorsBySamplerConsumer.java b/src/core/org/apache/jmeter/report/processor/Top5ErrorsBySamplerConsumer.java
index b408b86..30807d9 100644
--- a/src/core/org/apache/jmeter/report/processor/Top5ErrorsBySamplerConsumer.java
+++ b/src/core/org/apache/jmeter/report/processor/Top5ErrorsBySamplerConsumer.java
@@ -38,7 +38,7 @@
      * Instantiates a new Top5 Errors by sampler consumer.
      */
     public Top5ErrorsBySamplerConsumer() {
-        super(true);
+        super(false);
     }
 
     /**
