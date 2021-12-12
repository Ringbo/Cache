diff --git a/src/functions/org/apache/jmeter/functions/LogFunction2.java b/src/functions/org/apache/jmeter/functions/LogFunction2.java
index 534571d..fa6a755 100644
--- a/src/functions/org/apache/jmeter/functions/LogFunction2.java
+++ b/src/functions/org/apache/jmeter/functions/LogFunction2.java
@@ -71,7 +71,7 @@
 
     /** {@inheritDoc} */
     @Override
-    public synchronized String execute(SampleResult previousResult, Sampler currentSampler)
+    public String execute(SampleResult previousResult, Sampler currentSampler)
             throws InvalidVariableException {
         String stringToLog = ((CompoundVariable) values[0]).execute();
 
