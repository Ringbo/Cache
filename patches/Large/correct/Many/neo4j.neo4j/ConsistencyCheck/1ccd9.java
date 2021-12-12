diff --git a/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java b/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java
index 399e38c..cb1738f 100644
--- a/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java
+++ b/enterprise/backup/src/main/java/org/neo4j/backup/check/ConsistencyCheck.java
@@ -331,10 +331,15 @@
             fail |= inconsistent( record,
                     "next record set but length less than maximum" );
         }
-        if ( record.getLength() > store.getRecordSize()
+        if ( record.getId() != 0
+             && record.getLength() > store.getRecordSize()
                                   - store.getRecordHeaderSize() )
         {
-            // The length must always be less than or equal to max
+            /*
+             *  The length must always be less than or equal to max,
+             *  except for the first dynamic record in a store, which
+             *  does not conform to the usual format
+             */
             fail |= inconsistent( record,
                     "length larger than maximum for store" );
         }
