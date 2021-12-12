diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/ComputeFormulaMeasuresStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/ComputeFormulaMeasuresStepTest.java
index f28f009..5fb4c2d 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/ComputeFormulaMeasuresStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/ComputeFormulaMeasuresStepTest.java
@@ -65,14 +65,14 @@
   ComputeFormulaMeasuresStep sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     FormulaRepository formulaRepository = mock(FormulaRepository.class);
     when(formulaRepository.getFormulas()).thenReturn(Lists.<Formula>newArrayList(new FakeFormula()));
     sut = new ComputeFormulaMeasuresStep(treeRootHolder, measureRepository, metricRepository, formulaRepository);
   }
 
   @Test
-  public void add_measures() throws Exception {
+  public void add_measures() {
     DumbComponent project = DumbComponent.builder(PROJECT, 1)
       .addChildren(
         DumbComponent.builder(MODULE, 11)
@@ -111,7 +111,7 @@
   }
 
   @Test
-  public void add_no_measure() throws Exception {
+  public void add_no_measure() {
     DumbComponent project = DumbComponent.builder(PROJECT, 1)
       .addChildren(
         DumbComponent.builder(MODULE, 11)
@@ -134,7 +134,7 @@
   }
 
   @Test
-  public void add_no_measure_when_no_file() throws Exception {
+  public void add_no_measure_when_no_file() {
     DumbComponent project = DumbComponent.builder(PROJECT, 1)
       .addChildren(
         DumbComponent.builder(MODULE, 11)
@@ -153,7 +153,7 @@
   }
 
   @Test
-  public void add_no_measure_on_module_without_file() throws Exception {
+  public void add_no_measure_on_module_without_file() {
     DumbComponent project = DumbComponent.builder(PROJECT, 1)
       .addChildren(
         DumbComponent.builder(MODULE, 11)
