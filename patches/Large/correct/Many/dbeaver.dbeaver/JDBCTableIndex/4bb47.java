diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableIndex.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableIndex.java
index ec0d48e..4c39985 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableIndex.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/struct/JDBCTableIndex.java
@@ -56,7 +56,7 @@
     }
 
     @Override
-    public DBSObjectContainer getContainer()
+    public CONTAINER getContainer()
     {
         return container;
     }
