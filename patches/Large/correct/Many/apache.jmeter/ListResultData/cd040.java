diff --git a/src/core/org/apache/jmeter/report/processor/ListResultData.java b/src/core/org/apache/jmeter/report/processor/ListResultData.java
index 51329c0..ce7ebd0 100644
--- a/src/core/org/apache/jmeter/report/processor/ListResultData.java
+++ b/src/core/org/apache/jmeter/report/processor/ListResultData.java
@@ -39,7 +39,7 @@
      * .report.processor.ResultDataVisitor)
      */
     @Override
-    public <TVisit> TVisit accept(ResultDataVisitor<TVisit> visitor) {
+    public <T> T accept(ResultDataVisitor<T> visitor) {
         return visitor.visitListResult(this);
     }
 
