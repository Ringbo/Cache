diff --git a/src/core/org/apache/jmeter/report/processor/ValueResultData.java b/src/core/org/apache/jmeter/report/processor/ValueResultData.java
index eee746c..5498ffb 100644
--- a/src/core/org/apache/jmeter/report/processor/ValueResultData.java
+++ b/src/core/org/apache/jmeter/report/processor/ValueResultData.java
@@ -69,7 +69,7 @@
      * .report.processor.ResultDataVisitor)
      */
     @Override
-    public <TVisit> TVisit accept(ResultDataVisitor<TVisit> visitor) {
+    public <T> T accept(ResultDataVisitor<T> visitor) {
         return visitor.visitValueResult(this);
     }
 
