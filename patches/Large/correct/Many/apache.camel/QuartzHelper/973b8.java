diff --git a/components/camel-quartz2/src/main/java/org/apache/camel/component/quartz2/QuartzHelper.java b/components/camel-quartz2/src/main/java/org/apache/camel/component/quartz2/QuartzHelper.java
index bb6db52..7263bae 100644
--- a/components/camel-quartz2/src/main/java/org/apache/camel/component/quartz2/QuartzHelper.java
+++ b/components/camel-quartz2/src/main/java/org/apache/camel/component/quartz2/QuartzHelper.java
@@ -24,9 +24,10 @@
 
 public final class QuartzHelper {
 
-    public static final Logger LOG = LoggerFactory.getLogger(QuartzEndpoint.class);
+    public static final Logger LOG = LoggerFactory.getLogger(QuartzHelper.class);
 
     private QuartzHelper() {
+        // prevent instantiation
     }
 
     public static String getQuartzContextName(CamelContext camelContext) {
@@ -38,6 +39,14 @@
         }
     }
 
+    /**
+     * Adds the current CamelContext name and endpoint URI to the Job's jobData
+     * map.
+     * 
+     * @param camelContext The currently active camelContext
+     * @param jobDetail The job for which the jobData map shall be updated
+     * @param endpointUri URI of the endpoint name, if any. May be {@code null}
+     */
     public static void updateJobDataMap(CamelContext camelContext, JobDetail jobDetail, String endpointUri) {
         // Store this camelContext name into the job data
         JobDataMap jobDataMap = jobDetail.getJobDataMap();
