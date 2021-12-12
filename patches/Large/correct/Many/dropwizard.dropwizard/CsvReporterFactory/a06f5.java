diff --git a/dropwizard-metrics/src/main/java/io/dropwizard/metrics/CsvReporterFactory.java b/dropwizard-metrics/src/main/java/io/dropwizard/metrics/CsvReporterFactory.java
index 9eb0135..d20254a 100644
--- a/dropwizard-metrics/src/main/java/io/dropwizard/metrics/CsvReporterFactory.java
+++ b/dropwizard-metrics/src/main/java/io/dropwizard/metrics/CsvReporterFactory.java
@@ -51,7 +51,7 @@
     public ScheduledReporter build(MetricRegistry registry) {
         return CsvReporter.forRegistry(registry)
                           .convertDurationsTo(getDurationUnit())
-                          .convertDurationsTo(getRateUnit())
+                          .convertRatesTo(getRateUnit())
                           .filter(getFilter())
                           .formatFor(getLocale())
                           .build(getFile());
