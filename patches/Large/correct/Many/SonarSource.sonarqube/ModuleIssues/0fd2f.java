diff --git a/sonar-scanner-engine/src/main/java/org/sonar/batch/issue/ModuleIssues.java b/sonar-scanner-engine/src/main/java/org/sonar/batch/issue/ModuleIssues.java
index d120e01..23fb582 100644
--- a/sonar-scanner-engine/src/main/java/org/sonar/batch/issue/ModuleIssues.java
+++ b/sonar-scanner-engine/src/main/java/org/sonar/batch/issue/ModuleIssues.java
@@ -123,7 +123,7 @@
     }
   }
 
-  private ScannerReport.TextRange toProtobufTextRange(ScannerReport.TextRange.Builder textRangeBuilder, TextRange primaryTextRange) {
+  private static ScannerReport.TextRange toProtobufTextRange(ScannerReport.TextRange.Builder textRangeBuilder, TextRange primaryTextRange) {
     textRangeBuilder.clear();
     textRangeBuilder.setStartLine(primaryTextRange.start().line());
     textRangeBuilder.setStartOffset(primaryTextRange.start().lineOffset());
