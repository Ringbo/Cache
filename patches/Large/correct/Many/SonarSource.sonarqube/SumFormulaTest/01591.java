diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaTest.java
index cb5de24..d12c493 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaTest.java
@@ -43,12 +43,12 @@
   CounterContext counterContext = mock(CounterContext.class);
 
   @Test
-  public void check_create_new_counter_class() throws Exception {
+  public void check_create_new_counter_class() {
     assertThat(BASIC_SUM_FORMULA.createNewCounter().getClass()).isEqualTo(SumFormula.SumCounter.class);
   }
 
   @Test
-  public void fail_with_NPE_when_creating_formula_with_null_metric() throws Exception {
+  public void fail_with_NPE_when_creating_formula_with_null_metric() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("Metric key cannot be null");
 
@@ -56,12 +56,12 @@
   }
 
   @Test
-  public void check_output_metric_key_is_lines() throws Exception {
+  public void check_output_metric_key_is_lines() {
     assertThat(BASIC_SUM_FORMULA.getOutputMetricKey()).isEqualTo(LINES_KEY);
   }
 
   @Test
-  public void create_measure() throws Exception {
+  public void create_measure() {
     SumFormula.SumCounter counter = BASIC_SUM_FORMULA.createNewCounter();
     addMeasure(LINES_KEY, 10);
     counter.aggregate(counterContext);
@@ -70,7 +70,7 @@
   }
 
   @Test
-  public void create_measure_when_counter_is_aggregating_from_another_counter() throws Exception {
+  public void create_measure_when_counter_is_aggregating_from_another_counter() {
     SumFormula.SumCounter anotherCounter = BASIC_SUM_FORMULA.createNewCounter();
     addMeasure(LINES_KEY, 10);
     anotherCounter.aggregate(counterContext);
@@ -82,7 +82,7 @@
   }
 
   @Test
-  public void not_create_measure_on_file() throws Exception {
+  public void not_create_measure_on_file() {
     SumFormula.SumCounter counter = BASIC_SUM_FORMULA.createNewCounter();
     addMeasure(LINES_KEY, 10);
     counter.aggregate(counterContext);
@@ -91,7 +91,7 @@
   }
 
   @Test
-  public void not_create_measure_when_value_is_zero() throws Exception {
+  public void not_create_measure_when_value_is_zero() {
     SumFormula.SumCounter counter = BASIC_SUM_FORMULA.createNewCounter();
     when(counterContext.getMeasure(LINES_KEY)).thenReturn(Optional.<Measure>absent());
     counter.aggregate(counterContext);
