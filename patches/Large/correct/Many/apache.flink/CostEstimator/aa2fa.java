diff --git a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/costs/CostEstimator.java b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/costs/CostEstimator.java
index 7cd9e27..20cbdaf 100644
--- a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/costs/CostEstimator.java
+++ b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/costs/CostEstimator.java
@@ -132,7 +132,7 @@
 		}
 
 		// if we have a second input, add its costs
-		if (secConn != null) {
+		if (secConn != null && secConn.size() > 0) {
 			Costs secCost = new Costs();
 
 			// we assume that all connections in the list have the same ship strategy;
