diff --git a/src/core/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java b/src/core/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java
index dd63f3c..55c577b 100644
--- a/src/core/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java
+++ b/src/core/org/apache/jmeter/report/config/ReportGeneratorConfiguration.java
@@ -42,7 +42,7 @@
 
     private static final Logger LOG = LoggingManager.getLoggerForClass();
 
-    private static final String DATE_FORMAT = "dd/MM/yyyy HH:mm:ss"; //$NON-NLS-1$
+    private static final String RANGE_DATE_FORMAT = "yyyyMMddHHmmss"; //$NON-NLS-1$
 
     public static final char KEY_DELIMITER = '.';
     public static final String REPORT_GENERATOR_KEY_PREFIX = "jmeter.reportgenerator";
@@ -634,7 +634,7 @@
                 REPORT_GENERATOR_KEY_START_DATE, String.class);
         final String endDateValue = getOptionalProperty(props,
                 REPORT_GENERATOR_KEY_END_DATE, String.class);
-        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
+        SimpleDateFormat dateFormat = new SimpleDateFormat(RANGE_DATE_FORMAT);
         try {
             if(!StringUtils.isEmpty(startDateValue)) {
                 reportStartDate = dateFormat.parse(startDateValue);
@@ -642,7 +642,7 @@
             }
         } catch (ParseException e) {
             LOG.error("Error parsing property 'REPORT_GENERATOR_KEY_START_DATE' with value:" + startDateValue
-                    +" using format:"+DATE_FORMAT, e);
+                    +" using format:"+RANGE_DATE_FORMAT, e);
         }
         try {
             if(!StringUtils.isEmpty(endDateValue)) {
@@ -651,7 +651,7 @@
             }
         } catch (ParseException e) {
             LOG.error("Error parsing property 'REPORT_GENERATOR_KEY_START_DATE' with value:" + endDateValue 
-                    +" using format:"+DATE_FORMAT, e);
+                    +" using format:"+RANGE_DATE_FORMAT, e);
         }
         
         LOG.info("Will use date range start date: "+startDateValue+", end date: "+endDateValue);
