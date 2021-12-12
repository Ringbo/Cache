diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCCompositeCache.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCCompositeCache.java
index 6cce33e..b034ea7 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCCompositeCache.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/cache/JDBCCompositeCache.java
@@ -216,7 +216,7 @@
                 List<OBJECT> parentObjects = objectCache.get(parent);
                 if (parentObjects == null) {
                     parentObjects = new ArrayList<>();
-                    objectCache.put(parent, objects);
+                    objectCache.put(parent, parentObjects);
                 }
                 parentObjects.add(object);
             }
