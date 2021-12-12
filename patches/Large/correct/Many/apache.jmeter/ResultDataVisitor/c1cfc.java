diff --git a/src/core/org/apache/jmeter/report/processor/ResultDataVisitor.java b/src/core/org/apache/jmeter/report/processor/ResultDataVisitor.java
index 3a727a7..d53de27 100644
--- a/src/core/org/apache/jmeter/report/processor/ResultDataVisitor.java
+++ b/src/core/org/apache/jmeter/report/processor/ResultDataVisitor.java
@@ -21,11 +21,11 @@
  * The interface ResultDataVisitor represents a visitor for result data from
  * samples processing.
  *
- * @param <TVisit>
+ * @param <T>
  *            the type returned by visit methods
  * @since 3.0
  */
-public interface ResultDataVisitor<TVisit> {
+public interface ResultDataVisitor<T> {
 
     /**
      * Visits the specified list result.
@@ -34,7 +34,7 @@
      *            the list result
      * @return the result of the visit
      */
-    TVisit visitListResult(ListResultData listResult);
+    T visitListResult(ListResultData listResult);
 
     /**
      * Visits the specified map result.
@@ -43,7 +43,7 @@
      *            the map result
      * @return the result of the visit
      */
-    TVisit visitMapResult(MapResultData mapResult);
+    T visitMapResult(MapResultData mapResult);
 
     /**
      * Visits the specified value result.
@@ -52,5 +52,5 @@
      *            the value result
      * @return the result of the visit
      */
-    TVisit visitValueResult(ValueResultData valueResult);
+    T visitValueResult(ValueResultData valueResult);
 }
