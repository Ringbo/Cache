diff --git a/src/com/google/javascript/jscomp/NameAnalyzer.java b/src/com/google/javascript/jscomp/NameAnalyzer.java
index ff37887..a6863dc 100644
--- a/src/com/google/javascript/jscomp/NameAnalyzer.java
+++ b/src/com/google/javascript/jscomp/NameAnalyzer.java
@@ -147,7 +147,7 @@
 
   static final DiagnosticType REPORT_PATH_IO_ERROR =
       DiagnosticType.error("JSC_REPORT_PATH_IO_ERROR",
-          "Error writing compiler report to {0}");
+          "Error writing compiler report to {0}:\n{1}");
 
   /**
    * All the aliases in a program form a graph, where each global name is
@@ -1132,7 +1132,7 @@
     try {
       Files.write("", new File(reportPath), UTF_8);
     } catch (IOException e) {
-      compiler.report(JSError.make(REPORT_PATH_IO_ERROR, reportPath));
+      compiler.report(JSError.make(REPORT_PATH_IO_ERROR, reportPath, e.getMessage()));
     }
   }
 
@@ -1158,7 +1158,7 @@
       try {
         Files.append(getHtmlReport(), new File(reportPath), UTF_8);
       } catch (IOException e) {
-        compiler.report(JSError.make(REPORT_PATH_IO_ERROR, reportPath));
+        compiler.report(JSError.make(REPORT_PATH_IO_ERROR, reportPath, e.getMessage()));
       }
     }
 
