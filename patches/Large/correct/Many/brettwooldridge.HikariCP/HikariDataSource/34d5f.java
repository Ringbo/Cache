diff --git a/src/main/java/com/zaxxer/hikari/HikariDataSource.java b/src/main/java/com/zaxxer/hikari/HikariDataSource.java
index 6bbe7c3..6e8b863 100644
--- a/src/main/java/com/zaxxer/hikari/HikariDataSource.java
+++ b/src/main/java/com/zaxxer/hikari/HikariDataSource.java
@@ -190,7 +190,7 @@
     @Override
     public boolean isWrapperFor(Class<?> iface) throws SQLException
     {
-        return (pool != null & pool.getDataSource().getClass().isAssignableFrom(iface));
+        return (pool != null && pool.getDataSource().getClass().isAssignableFrom(iface));
     }
 
     /**
