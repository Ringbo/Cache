diff --git a/hazelcast/src/test/java/com/hazelcast/internal/nearcache/NearCacheTestUtils.java b/hazelcast/src/test/java/com/hazelcast/internal/nearcache/NearCacheTestUtils.java
index 2effdf4..4a05723 100644
--- a/hazelcast/src/test/java/com/hazelcast/internal/nearcache/NearCacheTestUtils.java
+++ b/hazelcast/src/test/java/com/hazelcast/internal/nearcache/NearCacheTestUtils.java
@@ -88,7 +88,7 @@
                 long ownedEntryCount = context.stats.getOwnedEntryCount();
                 assertTrue(format("Near Cache owned entry count didn't reach the desired value (%d vs. %d) (%s)",
                         ownedEntryCount, nearCacheSize, context.stats),
-                        ownedEntryCount >= nearCacheSize);
+                        ownedEntryCount == nearCacheSize);
             }
         });
     }
