diff --git a/stratosphere-java/src/main/java/eu/stratosphere/api/java/IterativeDataSet.java b/stratosphere-java/src/main/java/eu/stratosphere/api/java/IterativeDataSet.java
index bab990d..be3fdf7 100644
--- a/stratosphere-java/src/main/java/eu/stratosphere/api/java/IterativeDataSet.java
+++ b/stratosphere-java/src/main/java/eu/stratosphere/api/java/IterativeDataSet.java
@@ -137,6 +137,6 @@
 	@Override
 	protected eu.stratosphere.api.common.operators.SingleInputOperator<T, T, ?> translateToDataFlow(Operator<T> input) {
 		// All the translation magic happens when the iteration end is encountered.
-		throw new UnsupportedOperationException("This should never happen.");
+		throw new RuntimeException("Error while creating the data flow plan for an iteration: The iteration end was not specified correctly.");
 	}
 }
