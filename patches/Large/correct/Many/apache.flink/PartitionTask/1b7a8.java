diff --git a/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/PartitionTask.java b/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/PartitionTask.java
index cf3d9cc..1bd7e40 100644
--- a/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/PartitionTask.java
+++ b/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/PartitionTask.java
@@ -262,7 +262,7 @@
 		
 		// determine distribution pattern for reader from input ship strategy
 		DistributionPattern dpReader = null;
-		switch (config.getInputShipStrategy(0)) {
+		switch (config.getInputShipStrategy(1)) {
 		case FORWARD:
 			// forward requires Pointwise DP
 			dpReader = new PointwiseDistributionPattern();
