diff --git a/src/main/java/org/apache/ibatis/type/NStringTypeHandler.java b/src/main/java/org/apache/ibatis/type/NStringTypeHandler.java
index 52d59b4..91c5b63 100644
--- a/src/main/java/org/apache/ibatis/type/NStringTypeHandler.java
+++ b/src/main/java/org/apache/ibatis/type/NStringTypeHandler.java
@@ -28,28 +28,25 @@
   @Override
   public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
       throws SQLException {
-//    ps.setNString(i, ((String) parameter));
-    ps.setString(i, parameter);
+    ps.setNString(i, parameter);
   }
 
   @Override
   public String getNullableResult(ResultSet rs, String columnName)
       throws SQLException {
-//    return rs.getNString(columnName);
-    return rs.getString(columnName);
+    return rs.getNString(columnName);
   }
 
   @Override
   public String getNullableResult(ResultSet rs, int columnIndex)
       throws SQLException {
-    return rs.getString(columnIndex);
+    return rs.getNString(columnIndex);
   }
 
   @Override
   public String getNullableResult(CallableStatement cs, int columnIndex)
       throws SQLException {
-//    return cs.getNString(columnIndex);
-    return cs.getString(columnIndex);
+    return cs.getNString(columnIndex);
   }
 
 }
\ No newline at end of file
