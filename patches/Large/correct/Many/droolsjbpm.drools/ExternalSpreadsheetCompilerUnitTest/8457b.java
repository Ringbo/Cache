diff --git a/drools-decisiontables/src/test/java/org/drools/decisiontable/ExternalSpreadsheetCompilerUnitTest.java b/drools-decisiontables/src/test/java/org/drools/decisiontable/ExternalSpreadsheetCompilerUnitTest.java
index ad9ad6c..c936dd0 100644
--- a/drools-decisiontables/src/test/java/org/drools/decisiontable/ExternalSpreadsheetCompilerUnitTest.java
+++ b/drools-decisiontables/src/test/java/org/drools/decisiontable/ExternalSpreadsheetCompilerUnitTest.java
@@ -29,8 +29,7 @@
  *         itself is correct).
  */
 public class ExternalSpreadsheetCompilerUnitTest extends TestCase {
-//  @FIXME    
-	public void FIXME_testLoadFromClassPath() {
+	public void testLoadFromClassPath() {
 		final ExternalSpreadsheetCompiler converter = new ExternalSpreadsheetCompiler();
 		final String drl = converter.compile("/data/MultiSheetDST.xls",
 				"/templates/test_template1.drl", 11, 2);
@@ -44,17 +43,15 @@
 		assertTrue(drl.indexOf("import example.model.Car;") > -1);
 	}
 
-//@FIXME    
-	public void FIXME_testLoadSpecificWorksheet() {
+	public void testLoadSpecificWorksheet() {
 		final ExternalSpreadsheetCompiler converter = new ExternalSpreadsheetCompiler();
 		final String drl = converter.compile("/data/MultiSheetDST.xls",
-				"Another Sheet", "/templates/test_template1.drl", 21, 2);
+				"Another Sheet", "/templates/test_template1.drl", 11, 2);
 //		System.out.println(drl);
 		assertNotNull(drl);
 	}
 
- //@FIXME
-	public void FIXME_testLoadCsv() {
+	public void testLoadCsv() {
 		final ExternalSpreadsheetCompiler converter = new ExternalSpreadsheetCompiler();
 		final String drl = converter.compile("/data/ComplexWorkbook.csv",
 				"/templates/test_template2.drl", InputType.CSV, 10, 2);
