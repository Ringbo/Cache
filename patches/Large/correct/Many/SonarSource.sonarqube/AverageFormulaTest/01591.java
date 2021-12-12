diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaTest.java
index 2a3c0d8..09aeaae 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaTest.java
@@ -53,7 +53,7 @@
   public ExpectedException thrown = ExpectedException.none();
 
   @Test
-  public void fail_with_NPE_when_building_formula_without_output_metric() throws Exception {
+  public void fail_with_NPE_when_building_formula_without_output_metric() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("Output metric key cannot be null");
 
@@ -65,7 +65,7 @@
   }
 
   @Test
-  public void fail_with_NPE_when_building_formula_without_main_metric() throws Exception {
+  public void fail_with_NPE_when_building_formula_without_main_metric() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("Main metric Key cannot be null");
 
@@ -77,7 +77,7 @@
   }
 
   @Test
-  public void fail_with_NPE_when_building_formula_without_by_metric() throws Exception {
+  public void fail_with_NPE_when_building_formula_without_by_metric() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("By metric Key cannot be null");
 
@@ -89,17 +89,17 @@
   }
 
   @Test
-  public void check_new_counter_class() throws Exception {
+  public void check_new_counter_class() {
     assertThat(BASIC_AVERAGE_FORMULA.createNewCounter().getClass()).isEqualTo(AverageFormula.AverageCounter.class);
   }
 
   @Test
-  public void check_output_metric_key_is_function_complexity_key() throws Exception {
+  public void check_output_metric_key_is_function_complexity_key() {
     assertThat(BASIC_AVERAGE_FORMULA.getOutputMetricKey()).isEqualTo(FUNCTION_COMPLEXITY_KEY);
   }
 
   @Test
-  public void create_measure_when_counter_is_aggregated_from_context() throws Exception {
+  public void create_measure_when_counter_is_aggregated_from_context() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10d);
     addMeasure(FUNCTIONS_KEY, 2d);
@@ -109,7 +109,7 @@
   }
 
   @Test
-  public void create_measure_when_counter_is_aggregated_from_another_counter() throws Exception {
+  public void create_measure_when_counter_is_aggregated_from_another_counter() {
     AverageFormula.AverageCounter anotherCounter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10d);
     addMeasure(FUNCTIONS_KEY, 2d);
@@ -122,7 +122,7 @@
   }
 
   @Test
-  public void create_double_measure() throws Exception {
+  public void create_double_measure() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10d);
     addMeasure(FUNCTIONS_KEY, 2d);
@@ -132,7 +132,7 @@
   }
 
   @Test
-  public void create_integer_measure() throws Exception {
+  public void create_integer_measure() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10);
     addMeasure(FUNCTIONS_KEY, 2);
@@ -142,7 +142,7 @@
   }
 
   @Test
-  public void create_long_measure() throws Exception {
+  public void create_long_measure() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10L);
     addMeasure(FUNCTIONS_KEY, 2L);
@@ -152,7 +152,7 @@
   }
 
   @Test
-  public void not_create_measure_when_aggregated_measure_has_no_value() throws Exception {
+  public void not_create_measure_when_aggregated_measure_has_no_value() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10L);
     when(counterContext.getMeasure(FUNCTIONS_KEY)).thenReturn(Optional.of(Measure.newMeasureBuilder().createNoValue()));
@@ -162,7 +162,7 @@
   }
 
   @Test
-  public void fail_with_IAE_when_aggregate_from_component_and_context_with_not_numeric_measures() throws Exception {
+  public void fail_with_IAE_when_aggregate_from_component_and_context_with_not_numeric_measures() {
     thrown.expect(IllegalArgumentException.class);
     thrown.expectMessage("Measure of type 'STRING' are not supported");
 
@@ -175,7 +175,7 @@
   }
 
   @Test
-  public void no_measure_created_when_counter_has_no_value() throws Exception {
+  public void no_measure_created_when_counter_has_no_value() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     when(counterContext.getMeasure(anyString())).thenReturn(Optional.<Measure>absent());
     counter.aggregate(counterContext);
@@ -184,7 +184,7 @@
   }
 
   @Test
-  public void not_create_measure_when_only_one_measure() throws Exception {
+  public void not_create_measure_when_only_one_measure() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10L);
     when(counterContext.getMeasure(FUNCTIONS_KEY)).thenReturn(Optional.<Measure>absent());
@@ -194,7 +194,7 @@
   }
 
   @Test
-  public void not_create_measure_when_by_value_is_zero() throws Exception {
+  public void not_create_measure_when_by_value_is_zero() {
     AverageFormula.AverageCounter counter = BASIC_AVERAGE_FORMULA.createNewCounter();
     addMeasure(COMPLEXITY_IN_FUNCTIONS_KEY, 10d);
     addMeasure(FUNCTIONS_KEY, 0d);
@@ -204,7 +204,7 @@
   }
 
   @Test
-  public void create_measure_from_fall_back_measure() throws Exception {
+  public void create_measure_from_fall_back_measure() {
     AverageFormula sut = Builder.newBuilder()
       .setOutputMetricKey(FUNCTION_COMPLEXITY_KEY)
       .setMainMetricKey(COMPLEXITY_IN_FUNCTIONS_KEY)
@@ -222,7 +222,7 @@
   }
 
   @Test
-  public void not_use_fallback_measure_if_main_measure_exists() throws Exception {
+  public void not_use_fallback_measure_if_main_measure_exists() {
     AverageFormula sut = Builder.newBuilder()
       .setOutputMetricKey(FUNCTION_COMPLEXITY_KEY)
       .setMainMetricKey(COMPLEXITY_IN_FUNCTIONS_KEY)
