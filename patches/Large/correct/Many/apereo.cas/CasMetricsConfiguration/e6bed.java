diff --git a/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasMetricsConfiguration.java b/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasMetricsConfiguration.java
index c0020de..4df9b5d 100644
--- a/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasMetricsConfiguration.java
+++ b/webapp/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasMetricsConfiguration.java
@@ -79,7 +79,7 @@
                 .convertRatesTo(TimeUnit.MILLISECONDS)
                 .convertDurationsTo(TimeUnit.MILLISECONDS)
                 .build())
-                .start(Beans.newDuration(casProperties.getMetrics().getRefreshInterval()).toMillis(), TimeUnit.SECONDS);
+                .start(Beans.newDuration(casProperties.getMetrics().getRefreshInterval()).getSeconds(), TimeUnit.SECONDS);
 
         registerReporter(JmxReporter.forRegistry(metricRegistry).build());
     }
