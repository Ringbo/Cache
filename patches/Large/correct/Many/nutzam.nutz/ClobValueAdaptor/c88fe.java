diff --git a/src/org/nutz/dao/impl/jdbc/ClobValueAdaptor.java b/src/org/nutz/dao/impl/jdbc/ClobValueAdaptor.java
index acfdf4e..1ffa98e 100644
--- a/src/org/nutz/dao/impl/jdbc/ClobValueAdaptor.java
+++ b/src/org/nutz/dao/impl/jdbc/ClobValueAdaptor.java
@@ -23,7 +23,7 @@
         Clob clob = rs.getClob(colName);
         if (clob == null)
             return null;
-        Files.write(f, clob.getAsciiStream());
+        Files.write(f, clob.getCharacterStream());
         return new SimpleClob(f);
     }
 
