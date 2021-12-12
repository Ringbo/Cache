diff --git a/src/main/java/org/testng/reporters/JUnitReportReporter.java b/src/main/java/org/testng/reporters/JUnitReportReporter.java
index 518393e..6e7691a 100644
--- a/src/main/java/org/testng/reporters/JUnitReportReporter.java
+++ b/src/main/java/org/testng/reporters/JUnitReportReporter.java
@@ -61,7 +61,7 @@
         TestTag testTag = new TestTag();
 
         boolean isSuccess = tr.getStatus() == ITestResult.SUCCESS;
-        if (isSuccess) {
+        if (! isSuccess) {
           if (tr.getThrowable() instanceof AssertionError) {
             errors++;
           } else {
