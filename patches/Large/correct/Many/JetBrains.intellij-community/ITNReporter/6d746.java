diff --git a/platform/platform-impl/src/com/intellij/diagnostic/ITNReporter.java b/platform/platform-impl/src/com/intellij/diagnostic/ITNReporter.java
index 29d5fa9..37eba35 100644
--- a/platform/platform-impl/src/com/intellij/diagnostic/ITNReporter.java
+++ b/platform/platform-impl/src/com/intellij/diagnostic/ITNReporter.java
@@ -146,7 +146,7 @@
             else {
               msg = DiagnosticBundle.message("error.report.sending.failure");
             }
-            if (Messages.showYesNoDialog(project, msg,
+            if (Messages.showYesNoDialog(parentComponent, msg,
                                          ReportMessages.ERROR_REPORT, Messages.getErrorIcon()) != 0) {
               callback.consume(new SubmittedReportInfo(null, "0", SubmittedReportInfo.SubmissionStatus.FAILED));
             }
