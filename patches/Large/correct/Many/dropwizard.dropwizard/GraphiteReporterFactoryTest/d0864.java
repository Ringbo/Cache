diff --git a/dropwizard-metrics-graphite/src/test/java/io/dropwizard/metrics/graphite/GraphiteReporterFactoryTest.java b/dropwizard-metrics-graphite/src/test/java/io/dropwizard/metrics/graphite/GraphiteReporterFactoryTest.java
index 878b90f..74a8655 100644
--- a/dropwizard-metrics-graphite/src/test/java/io/dropwizard/metrics/graphite/GraphiteReporterFactoryTest.java
+++ b/dropwizard-metrics-graphite/src/test/java/io/dropwizard/metrics/graphite/GraphiteReporterFactoryTest.java
@@ -53,7 +53,7 @@
 
         final Graphite graphite = argument.getValue();
         assertThat(getField(graphite, "hostname")).isEqualTo("localhost");
-        assertThat(getField(graphite, "port")).isEqualTo(8080);
+        assertThat(getField(graphite, "port")).isEqualTo(2003);
         assertThat(getField(graphite, "address")).isNull();
     }
 
@@ -67,7 +67,7 @@
 
         final GraphiteUDP graphite = argument.getValue();
         assertThat(getField(graphite, "hostname")).isEqualTo("localhost");
-        assertThat(getField(graphite, "port")).isEqualTo(8080);
+        assertThat(getField(graphite, "port")).isEqualTo(2003);
         assertThat(getField(graphite, "address")).isNull();
     }
 
