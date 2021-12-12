diff --git a/sopremo/sopremo-cleansing/src/test/java/eu/stratosphere/sopremo/cleansing/TransitiveClosure/ParallelTransitiveClosureTest.java b/sopremo/sopremo-cleansing/src/test/java/eu/stratosphere/sopremo/cleansing/TransitiveClosure/ParallelTransitiveClosureTest.java
index 90e9824..79c2f5e 100644
--- a/sopremo/sopremo-cleansing/src/test/java/eu/stratosphere/sopremo/cleansing/TransitiveClosure/ParallelTransitiveClosureTest.java
+++ b/sopremo/sopremo-cleansing/src/test/java/eu/stratosphere/sopremo/cleansing/TransitiveClosure/ParallelTransitiveClosureTest.java
@@ -60,7 +60,7 @@
 	public void shouldFindTransitiveClosureInWholeMatrix() {
 		final TestTransitiveClosure transitiveClosure = new TestTransitiveClosure();
 		transitiveClosure.setPhase(3);
-		transitiveClosure.setNumberOfPartitions(6);
+		transitiveClosure.setNumberOfPartitions(3);
 		
 		final SopremoTestPlan sopremoTestPlan = new SopremoTestPlan(transitiveClosure);
 		String nullInput = SopremoTest.getResourcePath("null.json");
