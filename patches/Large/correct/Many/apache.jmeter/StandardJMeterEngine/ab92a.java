diff --git a/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java b/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java
index 27ed59c..9900f7f 100644
--- a/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java
+++ b/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java
@@ -578,7 +578,7 @@
     }
 
     public void askThreadsToStop() {
-        if (engine == null) { // Will be null if StopTest thread has started
+        if (engine != null) { // Will be null if StopTest thread has started
             engine.stopTest(false);
         }
     }
