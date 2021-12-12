diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/DistributionFormulaTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/DistributionFormulaTest.java
index b78038a..09b9ec7 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/DistributionFormulaTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/DistributionFormulaTest.java
@@ -43,12 +43,12 @@
   CounterContext counterContext = mock(CounterContext.class);
 
   @Test
-  public void check_new_counter_class() throws Exception {
+  public void check_new_counter_class() {
     assertThat(BASIC_DISTRIBUTION_FORMULA.createNewCounter().getClass()).isEqualTo(DistributionFormula.DistributionCounter.class);
   }
 
   @Test
-  public void fail_with_NPE_when_creating_counter_with_null_metric() throws Exception {
+  public void fail_with_NPE_when_creating_counter_with_null_metric() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("Metric key cannot be null");
 
@@ -56,12 +56,12 @@
   }
 
   @Test
-  public void check_output_metric_key_is_function_complexity_distribution() throws Exception {
+  public void check_output_metric_key_is_function_complexity_distribution() {
     assertThat(BASIC_DISTRIBUTION_FORMULA.getOutputMetricKey()).isEqualTo(FUNCTION_COMPLEXITY_DISTRIBUTION_KEY);
   }
 
   @Test
-  public void create_measure() throws Exception {
+  public void create_measure() {
     DistributionFormula.DistributionCounter counter = BASIC_DISTRIBUTION_FORMULA.createNewCounter();
     addMeasure(FUNCTION_COMPLEXITY_DISTRIBUTION_KEY, "0=3;3=7;6=10");
     counter.aggregate(counterContext);
@@ -70,7 +70,7 @@
   }
 
   @Test
-  public void create_measure_when_counter_is_aggregating_from_another_counter() throws Exception {
+  public void create_measure_when_counter_is_aggregating_from_another_counter() {
     DistributionFormula.DistributionCounter anotherCounter = BASIC_DISTRIBUTION_FORMULA.createNewCounter();
     addMeasure(FUNCTION_COMPLEXITY_DISTRIBUTION_KEY, "0=3;3=7;6=10");
     anotherCounter.aggregate(counterContext);
@@ -82,7 +82,7 @@
   }
 
   @Test
-  public void create_no_measure_when_no_value() throws Exception {
+  public void create_no_measure_when_no_value() {
     DistributionFormula.DistributionCounter counter = BASIC_DISTRIBUTION_FORMULA.createNewCounter();
     when(counterContext.getMeasure(FUNCTION_COMPLEXITY_DISTRIBUTION_KEY)).thenReturn(Optional.<Measure>absent());
     counter.aggregate(counterContext);
@@ -91,7 +91,7 @@
   }
 
   @Test
-  public void not_create_measure_when_on_file() throws Exception {
+  public void not_create_measure_when_on_file() {
     DistributionFormula.DistributionCounter counter = BASIC_DISTRIBUTION_FORMULA.createNewCounter();
     addMeasure(FUNCTION_COMPLEXITY_DISTRIBUTION_KEY, "0=3;3=7;6=10");
     counter.aggregate(counterContext);
