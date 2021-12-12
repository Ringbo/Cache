diff --git a/src/main/java/org/apache/ibatis/type/TypeHandlerRegistry.java b/src/main/java/org/apache/ibatis/type/TypeHandlerRegistry.java
index 77addab..e5e173d 100644
--- a/src/main/java/org/apache/ibatis/type/TypeHandlerRegistry.java
+++ b/src/main/java/org/apache/ibatis/type/TypeHandlerRegistry.java
@@ -96,14 +96,14 @@
     register(String.class, JdbcType.CHAR, new StringTypeHandler());
     register(String.class, JdbcType.CLOB, new ClobTypeHandler());
     register(String.class, JdbcType.VARCHAR, new StringTypeHandler());
-    register(String.class, JdbcType.LONGVARCHAR, new ClobTypeHandler());
+    register(String.class, JdbcType.LONGVARCHAR, new StringTypeHandler());
     register(String.class, JdbcType.NVARCHAR, new NStringTypeHandler());
     register(String.class, JdbcType.NCHAR, new NStringTypeHandler());
     register(String.class, JdbcType.NCLOB, new NClobTypeHandler());
     register(JdbcType.CHAR, new StringTypeHandler());
     register(JdbcType.VARCHAR, new StringTypeHandler());
     register(JdbcType.CLOB, new ClobTypeHandler());
-    register(JdbcType.LONGVARCHAR, new ClobTypeHandler());
+    register(JdbcType.LONGVARCHAR, new StringTypeHandler());
     register(JdbcType.NVARCHAR, new NStringTypeHandler());
     register(JdbcType.NCHAR, new NStringTypeHandler());
     register(JdbcType.NCLOB, new NClobTypeHandler());
