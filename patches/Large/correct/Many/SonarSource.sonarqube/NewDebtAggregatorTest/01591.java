diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtAggregatorTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtAggregatorTest.java
index f8f2173..221ff79 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtAggregatorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtAggregatorTest.java
@@ -99,7 +99,7 @@
   }
 
   @Test
-  public void no_measures_if_no_periods() throws Exception {
+  public void no_measures_if_no_periods() {
     periodsHolder.setPeriods();
     DefaultIssue unresolved = new DefaultIssue().setDebt(Duration.create(10));
     verifyZeroInteractions(calculator);
