diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaStepTest.java
index 683052e..27d7b01 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/AverageFormulaStepTest.java
@@ -63,7 +63,7 @@
   ComputeFormulaMeasuresStep sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     FormulaRepository formulaRepository = mock(FormulaRepository.class);
     when(formulaRepository.getFormulas()).thenReturn(Lists.<Formula>newArrayList(
       AverageFormula.Builder.newBuilder()
@@ -75,7 +75,7 @@
   }
 
   @Test
-  public void add_measures() throws Exception {
+  public void add_measures() {
     DumbComponent project = builder(PROJECT, 1)
       .addChildren(
         builder(MODULE, 11)
