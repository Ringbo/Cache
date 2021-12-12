diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/CoreFormulaRepositoryImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/CoreFormulaRepositoryImplTest.java
index ddba6cc..f5cec08 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/formula/CoreFormulaRepositoryImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/formula/CoreFormulaRepositoryImplTest.java
@@ -27,7 +27,7 @@
 public class CoreFormulaRepositoryImplTest {
 
   @Test
-  public void check_formulas_are_not_empty() throws Exception {
+  public void check_formulas_are_not_empty() {
     assertThat(new CoreFormulaRepositoryImpl().getFormulas()).isNotEmpty();
 
   }
