diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableObject.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableObject.java
index ae9283e..d4b74a3 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableObject.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableObject.java
@@ -45,7 +45,7 @@
     }
 
     @Override
-    public DBSObject getParentObject()
+    public TABLE getParentObject()
     {
         return table;
     }
