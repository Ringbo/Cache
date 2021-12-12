diff --git a/src/main/java/org/apache/ibatis/executor/resultset/FastResultSetHandler.java b/src/main/java/org/apache/ibatis/executor/resultset/FastResultSetHandler.java
index bd3068f..316fd02 100644
--- a/src/main/java/org/apache/ibatis/executor/resultset/FastResultSetHandler.java
+++ b/src/main/java/org/apache/ibatis/executor/resultset/FastResultSetHandler.java
@@ -113,7 +113,7 @@
     if (resultMapId != null) {
       final ResultMap resultMap = configuration.getResultMap(resultMapId);
       final DefaultResultHandler resultHandler = new DefaultResultHandler(configuration.getDefaultListResultHandlerType());
-      ResultColumnCache resultColumnCache = new ResultColumnCache(cs.getMetaData(), configuration);
+      ResultColumnCache resultColumnCache = new ResultColumnCache(rs.getMetaData(), configuration);
       handleRowValues(rs, resultMap, resultHandler, new RowBounds(), resultColumnCache);
       metaParam.setValue(parameterMapping.getProperty(), resultHandler.getResultList());
     } else {
