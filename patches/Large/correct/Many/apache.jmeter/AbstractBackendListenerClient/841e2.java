diff --git a/src/components/org/apache/jmeter/visualizers/backend/AbstractBackendListenerClient.java b/src/components/org/apache/jmeter/visualizers/backend/AbstractBackendListenerClient.java
index 8da5983..2f53a48 100644
--- a/src/components/org/apache/jmeter/visualizers/backend/AbstractBackendListenerClient.java
+++ b/src/components/org/apache/jmeter/visualizers/backend/AbstractBackendListenerClient.java
@@ -43,7 +43,8 @@
  * supported for cases where extending this class is not possible (for example,
  * when the client class is already a subclass of some other class).
  * <p>
- * The handleSampleResult() method of BackendListenerClient does not have a default
+ * The {@link BackendListenerClient#handleSampleResults(java.util.List, BackendListenerContext)}
+ * method of BackendListenerClient does not have a default
  * implementation here, so subclasses must define at least this method. It may
  * be useful to override other methods as well.
  *
@@ -86,7 +87,7 @@
         return LOGGER;
     }
 
-    /* (non-Javadoc)
+    /**
      * @see org.apache.jmeter.visualizers.backend.BackendListenerClient#createSampleResult(org.apache.jmeter.samplers.SampleResult)
      */
     @Override
@@ -99,7 +100,7 @@
      * @param sampleLabel Name of sample used as key
      * @return {@link SamplerMetric}
      */
-    protected SamplerMetric getSamplerMetric(String sampleLabel) {
+    protected final SamplerMetric getSamplerMetric(String sampleLabel) {
         SamplerMetric samplerMetric = metricsPerSampler.get(sampleLabel);
         if(samplerMetric == null) {
             samplerMetric = new SamplerMetric();
@@ -119,7 +120,7 @@
     }
 
     /**
-     * @return UserMetric
+     * @return {@link UserMetric}
      */
     protected UserMetric getUserMetrics() {
         return userMetrics;
