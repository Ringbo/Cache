diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java
index 7cb0052..ca3c89c 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistMeasuresStepTest.java
@@ -120,12 +120,12 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     session.close();
   }
 
   @Test
-  public void insert_measures_from_report() throws Exception {
+  public void insert_measures_from_report() {
     metricRepository.add(1, STRING_METRIC);
     metricRepository.add(2, DOUBLE_METRIC);
 
@@ -223,7 +223,7 @@
   }
 
   @Test(expected = IllegalStateException.class)
-  public void fail_with_ISE_when_trying_to_insert_forbidden_measures() throws Exception {
+  public void fail_with_ISE_when_trying_to_insert_forbidden_measures() {
     metricRepository.add(1, DUPLICATIONS_DATA);
 
     reportReader.putMeasures(FILE_REF, Arrays.asList(
@@ -237,7 +237,7 @@
   }
 
   @Test
-  public void do_not_insert_file_complexity_distribution_metric_on_files() throws Exception {
+  public void do_not_insert_file_complexity_distribution_metric_on_files() {
     metricRepository.add(1, FILE_COMPLEXITY_DISTRIBUTION);
 
     reportReader.putMeasures(PROJECT_REF, Arrays.asList(
@@ -270,7 +270,7 @@
   }
 
   @Test
-  public void do_not_insert_function_complexity_distribution_metric_on_files() throws Exception {
+  public void do_not_insert_function_complexity_distribution_metric_on_files() {
     metricRepository.add(1, FUNCTION_COMPLEXITY_DISTRIBUTION);
 
     reportReader.putMeasures(PROJECT_REF, Arrays.asList(
