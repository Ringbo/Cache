diff --git a/src/functions/org/apache/jmeter/functions/LogFunction.java b/src/functions/org/apache/jmeter/functions/LogFunction.java
index 066af6c..e43f2aa 100644
--- a/src/functions/org/apache/jmeter/functions/LogFunction.java
+++ b/src/functions/org/apache/jmeter/functions/LogFunction.java
@@ -76,7 +76,7 @@
 
     /** {@inheritDoc} */
     @Override
-    public synchronized String execute(SampleResult previousResult, Sampler currentSampler)
+    public String execute(SampleResult previousResult, Sampler currentSampler)
             throws InvalidVariableException {
         // The method is synchronized to avoid interference of messages from multiple threads
         String stringToLog = ((CompoundVariable) values[0]).execute();
@@ -134,7 +134,7 @@
     }
 
     // Routine to perform the output (also used by __logn() function)
-    static void logDetails(Logger l, String s, String prio, Throwable t, String c) {
+    static synchronized void logDetails(Logger l, String s, String prio, Throwable t, String c) {
         if (prio.equalsIgnoreCase("OUT")) //$NON-NLS-1
         {
             printDetails(System.out, s, t, c);
