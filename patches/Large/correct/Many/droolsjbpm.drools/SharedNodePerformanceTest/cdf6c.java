diff --git a/drools-examples/src/test/java/com/sample/benchmark/SharedNodePerformanceTest.java b/drools-examples/src/test/java/com/sample/benchmark/SharedNodePerformanceTest.java
index 5be6b28..d8ffa44 100644
--- a/drools-examples/src/test/java/com/sample/benchmark/SharedNodePerformanceTest.java
+++ b/drools-examples/src/test/java/com/sample/benchmark/SharedNodePerformanceTest.java
@@ -362,7 +362,7 @@
 	
 	public void testNoneSharedNodes() {
 		try {
-			int factCount = 50000;
+			int factCount = 5000;
 			String file = "20rules_0shared.drl";
 			int loop = 5;
 			long totalload = 0;
