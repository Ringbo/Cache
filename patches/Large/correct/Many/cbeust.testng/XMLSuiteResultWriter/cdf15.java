diff --git a/src/main/org/testng/reporters/XMLSuiteResultWriter.java b/src/main/org/testng/reporters/XMLSuiteResultWriter.java
index 175b783..1d04168 100644
--- a/src/main/org/testng/reporters/XMLSuiteResultWriter.java
+++ b/src/main/org/testng/reporters/XMLSuiteResultWriter.java
@@ -231,7 +231,7 @@
         xmlBuffer.pop();
       }
 
-      String[] stackTraces = Utils.stackTrace(exception, true);
+      String[] stackTraces = Utils.stackTrace(exception, false);
       if ((config.getStackTraceOutputMethod() & XMLReporterConfig.STACKTRACE_SHORT) == XMLReporterConfig
               .STACKTRACE_SHORT) {
         xmlBuffer.push(XMLReporterConfig.TAG_SHORT_STACKTRACE);
