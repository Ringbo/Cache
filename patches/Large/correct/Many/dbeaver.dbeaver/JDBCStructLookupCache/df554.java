diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCStructLookupCache.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCStructLookupCache.java
index 35b77f0..4d5476c 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCStructLookupCache.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCStructLookupCache.java
@@ -113,7 +113,7 @@
                 return null;
             }
         } catch (SQLException ex) {
-            throw new DBException(ex, dataSource);
+            throw new DBException("Error loading object metadata from database", ex, dataSource);
         }
     }
 
