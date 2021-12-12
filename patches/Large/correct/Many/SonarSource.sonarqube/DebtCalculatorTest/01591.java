diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtCalculatorTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtCalculatorTest.java
index db2bd4d..d596d76 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtCalculatorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DebtCalculatorTest.java
@@ -42,14 +42,14 @@
   DebtCalculator underTest = new DebtCalculator(ruleRepository, new Durations(new Settings(), mock(I18n.class)));
 
   @Test
-  public void no_debt_if_function_is_not_defined() throws Exception {
+  public void no_debt_if_function_is_not_defined() {
     DefaultIssue issue = new DefaultIssue().setRuleKey(rule.getKey());
 
     assertThat(underTest.calculate(issue)).isNull();
   }
 
   @Test
-  public void default_effort_to_fix_is_one_for_linear_function() throws Exception {
+  public void default_effort_to_fix_is_one_for_linear_function() {
     int coefficient = 2;
     rule.setFunction(new DefaultDebtRemediationFunction(DebtRemediationFunction.Type.LINEAR, coefficient + "min", null));
 
@@ -57,7 +57,7 @@
   }
 
   @Test
-  public void linear_function() throws Exception {
+  public void linear_function() {
     double effortToFix = 3.0;
     int coefficient = 2;
     issue.setEffortToFix(effortToFix);
@@ -67,7 +67,7 @@
   }
 
   @Test
-  public void constant_function() throws Exception {
+  public void constant_function() {
     int constant = 2;
     issue.setEffortToFix(null);
     rule.setFunction(new DefaultDebtRemediationFunction(DebtRemediationFunction.Type.CONSTANT_ISSUE, null, constant + "min"));
@@ -76,7 +76,7 @@
   }
 
   @Test(expected = IllegalArgumentException.class)
-  public void effort_to_fix_must_not_be_set_with_constant_function() throws Exception {
+  public void effort_to_fix_must_not_be_set_with_constant_function() {
     int constant = 2;
     issue.setEffortToFix(3.0);
     rule.setFunction(new DefaultDebtRemediationFunction(DebtRemediationFunction.Type.CONSTANT_ISSUE, null, constant + "min"));
@@ -85,7 +85,7 @@
   }
 
   @Test
-  public void linear_with_offset_function() throws Exception {
+  public void linear_with_offset_function() {
     double effortToFix = 3.0;
     int coefficient = 2;
     int offset = 5;
