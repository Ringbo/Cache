diff --git a/src/test/java/org/apache/ibatis/logging/jdbc/ResultSetLoggerTest.java b/src/test/java/org/apache/ibatis/logging/jdbc/ResultSetLoggerTest.java
index 7dc1470..409030e 100644
--- a/src/test/java/org/apache/ibatis/logging/jdbc/ResultSetLoggerTest.java
+++ b/src/test/java/org/apache/ibatis/logging/jdbc/ResultSetLoggerTest.java
@@ -47,7 +47,7 @@
     when(rs.getMetaData()).thenReturn(metaData);
     when(metaData.getColumnCount()).thenReturn(1);
     when(metaData.getColumnType(1)).thenReturn(type);
-    when(metaData.getColumnName(1)).thenReturn("ColumnName");
+    when(metaData.getColumnLabel(1)).thenReturn("ColumnName");
     when(rs.getString(1)).thenReturn("value");
     when(log.isTraceEnabled()).thenReturn(true);
     ResultSet resultSet = ResultSetLogger.newInstance(rs, log);
