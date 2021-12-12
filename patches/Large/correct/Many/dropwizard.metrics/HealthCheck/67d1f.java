diff --git a/metrics-healthchecks/src/main/java/com/codahale/metrics/health/HealthCheck.java b/metrics-healthchecks/src/main/java/com/codahale/metrics/health/HealthCheck.java
index 7465b61..be7449a 100644
--- a/metrics-healthchecks/src/main/java/com/codahale/metrics/health/HealthCheck.java
+++ b/metrics-healthchecks/src/main/java/com/codahale/metrics/health/HealthCheck.java
@@ -16,7 +16,7 @@
      * or unhealthy (with either an error message or a thrown exception and optional details).
      */
     public static class Result {
-        private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
+        private static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
         private static final int PRIME = 31;
 
         /**
@@ -115,7 +115,7 @@
             this.message = message;
             this.error = error;
             this.details = details == null ? null : Collections.unmodifiableMap(details);
-            timestamp = DATE_FORMAT.format(new Date());
+            timestamp = new SimpleDateFormat(DATE_FORMAT_PATTERN).format(new Date());
         }
 
         /**
