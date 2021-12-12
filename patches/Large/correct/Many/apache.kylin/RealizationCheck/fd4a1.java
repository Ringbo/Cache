diff --git a/query/src/main/java/org/apache/kylin/query/routing/RealizationCheck.java b/query/src/main/java/org/apache/kylin/query/routing/RealizationCheck.java
index 7556b83..ec630cb 100644
--- a/query/src/main/java/org/apache/kylin/query/routing/RealizationCheck.java
+++ b/query/src/main/java/org/apache/kylin/query/routing/RealizationCheck.java
@@ -107,7 +107,7 @@
         // notFoundColumns = notFoundDimensions + notFoundMeasures;
         private Collection<TblColRef> notFoundColumns;
         private Collection<TblColRef> notFoundDimensions;
-        private Collection<TblColRef> notFoundMeasures;
+        private Collection<FunctionDesc> notFoundMeasures;
         private Collection<TblColRef> unmatchedDimensions;
         private Collection<FunctionDesc> unmatchedAggregations;
         private Collection<OLAPTableScan> notFoundTables;
@@ -169,7 +169,7 @@
             return incapableReason;
         }
 
-        public static IncapableReason notContainAllMeasures(Collection<TblColRef> notFoundMeasures) {
+        public static IncapableReason notContainAllMeasures(Collection<FunctionDesc> notFoundMeasures) {
             IncapableReason incapableReason = new IncapableReason();
             incapableReason.setIncapableType(IncapableType.CUBE_NOT_CONTAIN_ALL_MEASURE);
             incapableReason.setNotFoundMeasures(notFoundMeasures);
@@ -207,7 +207,7 @@
             this.notFoundDimensions = notFoundDimensions;
         }
 
-        public void setNotFoundMeasures(Collection<TblColRef> notFoundMeasures) {
+        public void setNotFoundMeasures(Collection<FunctionDesc> notFoundMeasures) {
             this.notFoundMeasures = notFoundMeasures;
         }
 
@@ -215,7 +215,7 @@
             return notFoundDimensions;
         }
 
-        public Collection<TblColRef> getNotFoundMeasures() {
+        public Collection<FunctionDesc> getNotFoundMeasures() {
             return notFoundMeasures;
         }
 
