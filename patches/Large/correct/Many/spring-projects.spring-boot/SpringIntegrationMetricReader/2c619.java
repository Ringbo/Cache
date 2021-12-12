diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/integration/SpringIntegrationMetricReader.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/integration/SpringIntegrationMetricReader.java
index c898557..ba68424 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/integration/SpringIntegrationMetricReader.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/integration/SpringIntegrationMetricReader.java
@@ -55,8 +55,8 @@
 			String prefix = "integration.channel." + name;
 			metrics.addAll(getStatistics(prefix + ".errorRate",
 					exporter.getChannelErrorRate(name)));
-			metrics.add(new Metric<Integer>(prefix + ".sendCount", exporter
-					.getChannelSendCount(name)));
+			metrics.add(new Metric<Long>(prefix + ".sendCount", exporter
+					.getChannelSendCountLong(name)));
 			metrics.addAll(getStatistics(prefix + ".sendRate",
 					exporter.getChannelSendRate(name)));
 			metrics.add(new Metric<Long>(prefix + ".receiveCount", exporter
@@ -66,8 +66,8 @@
 			metrics.addAll(getStatistics("integration.handler." + name + ".duration",
 					exporter.getHandlerDuration(name)));
 		}
-		metrics.add(new Metric<Long>("integration.activeHandlerCount", exporter
-				.getActiveHandlerCountLong()));
+		metrics.add(new Metric<Integer>("integration.activeHandlerCount", exporter
+				.getActiveHandlerCount()));
 		metrics.add(new Metric<Integer>("integration.handlerCount", exporter
 				.getHandlerCount()));
 		metrics.add(new Metric<Integer>("integration.channelCount", exporter
