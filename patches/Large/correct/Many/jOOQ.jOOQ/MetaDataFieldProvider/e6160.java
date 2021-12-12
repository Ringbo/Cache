diff --git a/jOOQ/src/main/java/org/jooq/impl/MetaDataFieldProvider.java b/jOOQ/src/main/java/org/jooq/impl/MetaDataFieldProvider.java
index 3abb756..b136ba6 100644
--- a/jOOQ/src/main/java/org/jooq/impl/MetaDataFieldProvider.java
+++ b/jOOQ/src/main/java/org/jooq/impl/MetaDataFieldProvider.java
@@ -94,7 +94,7 @@
         // This happens in Oracle for empty cursors returned from stored
         // procedures / functions
         catch (SQLException e) {
-            log.warn("Cannot fetch column count for cursor : " + e.getMessage());
+            log.info("Cannot fetch column count for cursor : " + e.getMessage());
             fieldList.add(field("dummy"));
         }
 
@@ -122,10 +122,11 @@
                     }
                 }
 
-                // [#650, #667] TODO This should not happen. All types
-                // should be known at this point
+                // [#650, #667] All types should be known at this point, but in plain
+                // SQL environments, it is possible that user-defined types, or vendor-specific
+                // types (e.g. such as PostgreSQL's json type) will cause this exception.
                 catch (SQLDialectNotSupportedException ignore) {
-                    log.warn("Not supported by dialect", ignore.getMessage());
+                    log.debug("Not supported by dialect", ignore.getMessage());
                 }
 
                 fieldList.add(field(name, dataType));
