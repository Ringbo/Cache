diff --git a/src/core/org/apache/jmeter/control/TransactionController.java b/src/core/org/apache/jmeter/control/TransactionController.java
index bf9e233..ce0dce2 100644
--- a/src/core/org/apache/jmeter/control/TransactionController.java
+++ b/src/core/org/apache/jmeter/control/TransactionController.java
@@ -170,7 +170,7 @@
 
         Sampler returnValue = super.next();
 
-        if (returnValue == null) // Must be the end of the controller
+        if (returnValue == null && !(calls == 0)) // Must be the end of the controller
         {
             if (res != null) {
                 res.setIdleTime(pauseTime+res.getIdleTime());
@@ -186,6 +186,9 @@
 
                 SamplePackage pack = (SamplePackage) threadVars.getObject(JMeterThread.PACKAGE_OBJECT);
                 if (pack == null) {
+                	// If child of TransactionController is a ThroughputController and TPC does
+                	// not sample its children, then we will have this
+                	// TODO Should this be at warn level ?
                     log.warn("Could not fetch SamplePackage");
                 } else {
                     SampleEvent event = new SampleEvent(res, threadContext.getThreadGroup().getName(),threadVars, true);
