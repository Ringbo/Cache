diff --git a/test/unit/org/apache/cassandra/db/CompactionsTest.java b/test/unit/org/apache/cassandra/db/CompactionsTest.java
index 21924e4..8e3ab40 100644
--- a/test/unit/org/apache/cassandra/db/CompactionsTest.java
+++ b/test/unit/org/apache/cassandra/db/CompactionsTest.java
@@ -51,7 +51,7 @@
                 inserted.add(key);
             }
             store.forceBlockingFlush();
-            assertEquals(table.getColumnFamilyStore("Standard1").getKeyRange("", "", 10000).keys.size(), inserted.size());
+            assertEquals(inserted.size(), table.getColumnFamilyStore("Standard1").getKeyRange("", "", 10000).keys.size());
         }
         while (true)
         {
@@ -63,6 +63,6 @@
         {
             store.doCompaction(2, store.getSSTables().size());
         }
-        assertEquals(table.getColumnFamilyStore("Standard1").getKeyRange("", "", 10000).keys.size(), inserted.size());
+        assertEquals(inserted.size(), table.getColumnFamilyStore("Standard1").getKeyRange("", "", 10000).keys.size());
     }
 }
