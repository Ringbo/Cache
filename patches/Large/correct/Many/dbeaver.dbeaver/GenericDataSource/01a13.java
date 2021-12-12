diff --git a/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/model/GenericDataSource.java b/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/model/GenericDataSource.java
index 49ecc73..b348e0c 100644
--- a/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/model/GenericDataSource.java
+++ b/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/model/GenericDataSource.java
@@ -399,7 +399,7 @@
             // Cache data types
             try {
                 dataTypeCache.getAllObjects(monitor, this);
-            } catch (DBException e) {
+            } catch (Exception e) {
                 log.warn("Can't fetch database data types", e);
             }
         } else {
