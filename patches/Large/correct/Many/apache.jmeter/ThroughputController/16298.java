diff --git a/src/components/org/apache/jmeter/control/ThroughputController.java b/src/components/org/apache/jmeter/control/ThroughputController.java
index 3c5ef1a..68a503b 100644
--- a/src/components/org/apache/jmeter/control/ThroughputController.java
+++ b/src/components/org/apache/jmeter/control/ThroughputController.java
@@ -313,12 +313,12 @@
         }
         else
         {
-            if (iteration == 0 && getPercentThroughputAsFloat() > 0)
+            if (iterations == 0 && getPercentThroughputAsFloat() > 0)
             {
                 retval = true;
             }
             else if (
-                ((float) executions / iteration) * 100
+                ((float) executions / iterations) * 100
                     <= getPercentThroughputAsFloat())
             {
                 retval = true;
