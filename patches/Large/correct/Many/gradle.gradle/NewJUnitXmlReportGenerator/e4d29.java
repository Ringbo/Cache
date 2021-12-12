diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/result/NewJUnitXmlReportGenerator.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/result/NewJUnitXmlReportGenerator.java
index d52bdee..a09d86a 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/result/NewJUnitXmlReportGenerator.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/testing/junit/result/NewJUnitXmlReportGenerator.java
@@ -44,7 +44,7 @@
     public NewJUnitXmlReportGenerator(File testResultsDir, TestResultsProvider testResultsProvider) {
         this.testResultsDir = testResultsDir;
         this.testResultsProvider = testResultsProvider;
-        this.saxWriter = new SaxJUnitXmlResultWriter(getHostname(), testResultsProvider, XMLOutputFactory.newFactory());
+        this.saxWriter = new SaxJUnitXmlResultWriter(getHostname(), testResultsProvider, XMLOutputFactory.newInstance());
     }
 
     public void generate() {
