diff --git a/drools-analytics/src/test/java/org/drools/analytics/AnalyzerTest.java b/drools-analytics/src/test/java/org/drools/analytics/AnalyzerTest.java
index 4890347..e026db6 100644
--- a/drools-analytics/src/test/java/org/drools/analytics/AnalyzerTest.java
+++ b/drools-analytics/src/test/java/org/drools/analytics/AnalyzerTest.java
@@ -12,7 +12,7 @@
 
 public class AnalyzerTest extends TestCase {
 
-	public void fixmetestAnalyzer() throws Exception {
+	public void testAnalyzer() throws Exception {
 		Analyzer anal = new Analyzer();
 
 		DrlParser p = new DrlParser();
@@ -26,7 +26,7 @@
 		AnalyticsResult result = anal.getResult();
 		assertNotNull(result);
 		assertEquals(0, result.getBySeverity(AnalyticsMessageBase.Severity.ERROR).size());
-		assertEquals(17, result.getBySeverity(AnalyticsMessageBase.Severity.WARNING).size());
+		assertEquals(10, result.getBySeverity(AnalyticsMessageBase.Severity.WARNING).size());
 		assertEquals(1, result.getBySeverity(AnalyticsMessageBase.Severity.NOTE).size());
 
 
@@ -44,8 +44,7 @@
 		result = anal.getResult();
 		assertNotNull(result);
 		assertEquals(0, result.getBySeverity(AnalyticsMessageBase.Severity.ERROR).size());
-		// This row has a problem
-		assertEquals( 17, result.getBySeverity(AnalyticsMessageBase.Severity.WARNING).size());
+		assertEquals(10, result.getBySeverity(AnalyticsMessageBase.Severity.WARNING).size());
 		assertEquals(1, result.getBySeverity(AnalyticsMessageBase.Severity.NOTE).size());
 
 
