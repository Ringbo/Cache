diff --git a/src/main/java/com/alibaba/druid/util/JdbcUtils.java b/src/main/java/com/alibaba/druid/util/JdbcUtils.java
index b451b85..14c0fd5 100644
--- a/src/main/java/com/alibaba/druid/util/JdbcUtils.java
+++ b/src/main/java/com/alibaba/druid/util/JdbcUtils.java
@@ -595,7 +595,7 @@
                 Map<String, Object> row = new LinkedHashMap<String, Object>();
 
                 for (int i = 0, size = rsMeta.getColumnCount(); i < size; ++i) {
-                    String columName = rsMeta.getColumnName(i + 1);
+                    String columName = rsMeta.getColumnLabel(i + 1);
                     Object value = rs.getObject(i + 1);
                     row.put(columName, value);
                 }
