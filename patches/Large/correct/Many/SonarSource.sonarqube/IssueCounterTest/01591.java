diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueCounterTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueCounterTest.java
index 4b957cc..681fca0 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueCounterTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/IssueCounterTest.java
@@ -108,7 +108,7 @@
   IssueCounter sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     initMetrics();
     measureRepository = new MeasureRepositoryImpl(null, reportReader, metricRepository);
 
@@ -116,7 +116,7 @@
   }
 
   @Test
-  public void count_issues_by_status() throws Exception {
+  public void count_issues_by_status() {
     periodsHolder.setPeriods();
 
     // bottom-up traversal -> from files to project
@@ -157,7 +157,7 @@
   }
 
   @Test
-  public void count_unresolved_issues_by_severity() throws Exception {
+  public void count_unresolved_issues_by_severity() {
     periodsHolder.setPeriods();
 
     // bottom-up traversal -> from files to project
@@ -189,7 +189,7 @@
   }
 
   @Test
-  public void count_new_issues() throws Exception {
+  public void count_new_issues() {
     Period period = newPeriod(3, 1500000000000L);
     periodsHolder.setPeriods(period);
 
