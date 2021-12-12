diff --git a/jOOQ-test/src/org/jooq/test/_/testcases/MetaDataTests.java b/jOOQ-test/src/org/jooq/test/_/testcases/MetaDataTests.java
index 1c29ace..4173848 100644
--- a/jOOQ-test/src/org/jooq/test/_/testcases/MetaDataTests.java
+++ b/jOOQ-test/src/org/jooq/test/_/testcases/MetaDataTests.java
@@ -182,7 +182,7 @@
                 assertEquals(7, schema.getUDTs().size());
             }
             else {
-                assertEquals(2, schema.getUDTs().size());
+                assertEquals(3, schema.getUDTs().size());
             }
         }
 
