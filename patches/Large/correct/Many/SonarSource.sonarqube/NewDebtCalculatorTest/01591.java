diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtCalculatorTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtCalculatorTest.java
index f6afc13..2777c98 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtCalculatorTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/NewDebtCalculatorTest.java
@@ -62,7 +62,7 @@
   }
 
   @Test
-  public void new_debt_if_issue_created_before_period() throws Exception {
+  public void new_debt_if_issue_created_before_period() {
     // creation: 1d
     // before period: increased to 2d
     // after period: increased to 5d, decreased to 4d then increased to 10d
@@ -81,7 +81,7 @@
   }
 
   @Test
-  public void new_debt_is_positive() throws Exception {
+  public void new_debt_is_positive() {
     // creation: 1d
     // before period: increased to 10d
     // after period: decreased to 2d
@@ -98,7 +98,7 @@
   }
 
   @Test
-  public void guess_initial_debt_when_first_change_is_after_period() throws Exception {
+  public void guess_initial_debt_when_first_change_is_after_period() {
     // creation: 1d
     // after period: increased to 2d, then to 5d
     // -> new debt is 5d - 1d = 4d
