diff --git a/src/main/java/com/alibaba/druid/stat/DruidStatManagerFacade.java b/src/main/java/com/alibaba/druid/stat/DruidStatManagerFacade.java
index 7c9cfb9..848c8c4 100644
--- a/src/main/java/com/alibaba/druid/stat/DruidStatManagerFacade.java
+++ b/src/main/java/com/alibaba/druid/stat/DruidStatManagerFacade.java
@@ -229,7 +229,7 @@
     public List<String> getActiveConnectionStackTraceByDataSourceId(Integer id) {
         Object datasource = getDruidDataSourceById(id);
 
-        if (datasource == null || DruidDataSourceUtils.isRemoveAbandoned(datasource)) {
+        if (datasource == null || !DruidDataSourceUtils.isRemoveAbandoned(datasource)) {
             return null;
         }
 
