diff --git a/src/fitnesse/reporting/history/TestXmlFormatter.java b/src/fitnesse/reporting/history/TestXmlFormatter.java
index cbad5d3..7c6055c 100755
--- a/src/fitnesse/reporting/history/TestXmlFormatter.java
+++ b/src/fitnesse/reporting/history/TestXmlFormatter.java
@@ -44,7 +44,7 @@
   }
 
   public long startedAt() {
-    return currentTestStartTime.startedAt();
+    return totalTimeMeasurement.startedAt();
   }
 
   public long runTime() {
