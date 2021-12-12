diff --git a/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java b/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java
index 63a26f8..4cd6146 100644
--- a/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java
+++ b/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/KeyColumnValueStoreTest.java
@@ -515,7 +515,7 @@
                         Collection<StaticBuffer> actual = Sets.newHashSet(i);
 
                         // Check
-                        log.error("Checking bounds [{}, {}) (expect {} keys)",
+                        log.debug("Checking bounds [{}, {}) (expect {} keys)",
                                 new Object[]{startCol, endCol, expected.size()});
                         Assert.assertEquals(expected, actual);
                         i.close();
@@ -551,7 +551,7 @@
                         KeyIterator i = store.getKeys(krq, tx);
                         Collection<StaticBuffer> actual = Lists.newArrayList(i);
 
-                        log.error("Checking bounds key:[{}, {}) & col:[{}, {}) (expect {} keys)",
+                        log.debug("Checking bounds key:[{}, {}) & col:[{}, {}) (expect {} keys)",
                                 new Object[]{keyStart, keyEnd, startCol, endCol, expected.size()});
                         Assert.assertEquals(expected, actual);
                         i.close();
