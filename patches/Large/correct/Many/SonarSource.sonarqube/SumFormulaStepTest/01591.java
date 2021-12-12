diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaStepTest.java
index 40d2334..074bcc5 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/SumFormulaStepTest.java
@@ -59,14 +59,14 @@
   ComputeFormulaMeasuresStep sut;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     FormulaRepository formulaRepository = mock(FormulaRepository.class);
     when(formulaRepository.getFormulas()).thenReturn(Lists.<Formula>newArrayList(new SumFormula(LINES_KEY)));
     sut = new ComputeFormulaMeasuresStep(treeRootHolder, measureRepository, metricRepository, formulaRepository);
   }
 
   @Test
-  public void add_measures() throws Exception {
+  public void add_measures() {
     DumbComponent project = builder(PROJECT, 1)
       .addChildren(
         builder(MODULE, 11)
