diff --git a/aws-java-sdk-cloudwatchmetrics/src/main/java/com/amazonaws/metrics/internal/cloudwatch/MetricUploaderThread.java b/aws-java-sdk-cloudwatchmetrics/src/main/java/com/amazonaws/metrics/internal/cloudwatch/MetricUploaderThread.java
index 542c669..ae09584 100644
--- a/aws-java-sdk-cloudwatchmetrics/src/main/java/com/amazonaws/metrics/internal/cloudwatch/MetricUploaderThread.java
+++ b/aws-java-sdk-cloudwatchmetrics/src/main/java/com/amazonaws/metrics/internal/cloudwatch/MetricUploaderThread.java
@@ -50,7 +50,7 @@
 			amazonCloudWatchClient = new AmazonCloudWatchClient(config.getCredentialsProvider());
 		} else if (config.getClientConfiguration() != null && config.getCredentialsProvider() == null) {
 			amazonCloudWatchClient = new AmazonCloudWatchClient(config.getClientConfiguration());
-		} else if (config.getClientConfiguration() != null && config.getCredentialsProvider() == null) {
+		} else if (config.getClientConfiguration() != null && config.getCredentialsProvider() != null) {
 			amazonCloudWatchClient = new AmazonCloudWatchClient(config.getCredentialsProvider(),
 					config.getClientConfiguration());
 		}
