diff --git a/modules/pds/src/test/java/org/apache/ignite/cache/database/IgnitePersistentStoreSchemaLoadTest.java b/modules/pds/src/test/java/org/apache/ignite/cache/database/IgnitePersistentStoreSchemaLoadTest.java
index a93e8d5..bdf64bb 100644
--- a/modules/pds/src/test/java/org/apache/ignite/cache/database/IgnitePersistentStoreSchemaLoadTest.java
+++ b/modules/pds/src/test/java/org/apache/ignite/cache/database/IgnitePersistentStoreSchemaLoadTest.java
@@ -151,7 +151,7 @@
 
         idx.setName(IDX_NAME);
 
-        ig0.context().query().dynamicTableCreate(SCHEMA_NAME, getEntity(), TMPL_NAME, true);
+        ig0.context().query().dynamicTableCreate(SCHEMA_NAME, getEntity(), TMPL_NAME, null, 1, true);
 
         assert indexCnt(ig0, CACHE_NAME) == 0;
 
@@ -183,7 +183,7 @@
             }
         });
 
-        ig0.context().query().dynamicTableCreate(SCHEMA_NAME, getEntity(), TMPL_NAME, true);
+        ig0.context().query().dynamicTableCreate(SCHEMA_NAME, getEntity(), TMPL_NAME, null, 1, true);
 
         assert indexCnt(ig0, CACHE_NAME) == 0;
 
