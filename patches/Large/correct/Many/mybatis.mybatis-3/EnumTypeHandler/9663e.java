diff --git a/src/main/java/org/apache/ibatis/type/EnumTypeHandler.java b/src/main/java/org/apache/ibatis/type/EnumTypeHandler.java
index ef4321d..54ba5fd 100644
--- a/src/main/java/org/apache/ibatis/type/EnumTypeHandler.java
+++ b/src/main/java/org/apache/ibatis/type/EnumTypeHandler.java
@@ -15,9 +15,9 @@
 
   public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
     if (jdbcType == null) {
-        ps.setString(i, parameter.toString());
+        ps.setString(i, parameter.name());
     } else {
-        ps.setObject(i, parameter.toString(), jdbcType.TYPE_CODE);
+        ps.setObject(i, parameter.name(), jdbcType.TYPE_CODE);
     }
   }
 
