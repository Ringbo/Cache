diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtAggregatorTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtAggregatorTest.java
index 3dd4d0e..8769a2b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtAggregatorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtAggregatorTest.java
@@ -85,7 +85,7 @@
   DebtAggregator underTest = new DebtAggregator(ruleRepository, debtModelHolder, metricRepository, measureRepository);
 
   @Test
-  public void sum_debt_of_unresolved_issues() throws Exception {
+  public void sum_debt_of_unresolved_issues() {
     DefaultIssue unresolved1 = new DefaultIssue().setDebt(Duration.create(10)).setRuleKey(rule.getKey());
     DefaultIssue unresolved2 = new DefaultIssue().setDebt(Duration.create(30)).setRuleKey(rule.getKey());
     DefaultIssue unresolvedWithoutDebt = new DefaultIssue().setRuleKey(rule.getKey());
@@ -112,7 +112,7 @@
   }
 
   @Test
-  public void aggregate_debt_of_children() throws Exception {
+  public void aggregate_debt_of_children() {
     DefaultIssue fileIssue = new DefaultIssue().setDebt(Duration.create(10)).setRuleKey(rule.getKey());
     DefaultIssue projectIssue = new DefaultIssue().setDebt(Duration.create(30)).setRuleKey(rule.getKey());
 
