diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datasource/csv/CSVThirdEyeDataSource.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datasource/csv/CSVThirdEyeDataSource.java
index 76ae2d3..a539aa8 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datasource/csv/CSVThirdEyeDataSource.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/datasource/csv/CSVThirdEyeDataSource.java
@@ -154,6 +154,7 @@
 
       DataFrame data = dataSets.get(function.getDataset());
 
+      // filter constraints
       if (request.getStartTimeInclusive() != null) {
         data = data.filter(new Series.LongConditional() {
           @Override
@@ -184,7 +185,7 @@
         }
       }
 
-      data = data.dropNull();
+      data = data.dropNull(inputName);
 
       //
       // with grouping
