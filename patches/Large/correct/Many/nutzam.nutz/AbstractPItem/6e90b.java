diff --git a/src/org/nutz/dao/impl/sql/pojo/AbstractPItem.java b/src/org/nutz/dao/impl/sql/pojo/AbstractPItem.java
index c902495..b09c8cc 100644
--- a/src/org/nutz/dao/impl/sql/pojo/AbstractPItem.java
+++ b/src/org/nutz/dao/impl/sql/pojo/AbstractPItem.java
@@ -43,7 +43,7 @@
         if (null != en) {
             MappingField mf = en.getField(name);
             if (null != mf)
-                return mf.getColumnName();
+                return mf.getColumnNameInSql();
         }
         return name;
     }
