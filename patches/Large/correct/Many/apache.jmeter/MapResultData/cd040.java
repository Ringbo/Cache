diff --git a/src/core/org/apache/jmeter/report/processor/MapResultData.java b/src/core/org/apache/jmeter/report/processor/MapResultData.java
index ae11a42..2ca6b66 100644
--- a/src/core/org/apache/jmeter/report/processor/MapResultData.java
+++ b/src/core/org/apache/jmeter/report/processor/MapResultData.java
@@ -40,7 +40,7 @@
      * .report.processor.ResultDataVisitor)
      */
     @Override
-    public <TVisit> TVisit accept(ResultDataVisitor<TVisit> visitor) {
+    public <T> T accept(ResultDataVisitor<T> visitor) {
         return visitor.visitMapResult(this);
     }
 
