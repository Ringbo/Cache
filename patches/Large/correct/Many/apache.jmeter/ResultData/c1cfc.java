diff --git a/src/core/org/apache/jmeter/report/processor/ResultData.java b/src/core/org/apache/jmeter/report/processor/ResultData.java
index 0b42bbe..c372097 100644
--- a/src/core/org/apache/jmeter/report/processor/ResultData.java
+++ b/src/core/org/apache/jmeter/report/processor/ResultData.java
@@ -29,6 +29,7 @@
      *
      * @param visitor
      *            the visitor (must not be {@code null})
+     * @paran <T> type of the results of the {@link ResultDataVisitor}
      */
-    <TVisit> TVisit accept(ResultDataVisitor<TVisit> visitor);
+    <T> T accept(ResultDataVisitor<T> visitor);
 }
