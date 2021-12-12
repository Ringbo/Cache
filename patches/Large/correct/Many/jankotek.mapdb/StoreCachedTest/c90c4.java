diff --git a/src/test/java/org/mapdb/StoreCachedTest.java b/src/test/java/org/mapdb/StoreCachedTest.java
index 3bc7735..fce7466 100644
--- a/src/test/java/org/mapdb/StoreCachedTest.java
+++ b/src/test/java/org/mapdb/StoreCachedTest.java
@@ -36,7 +36,7 @@
         long recid = e.put(1L, Serializer.LONG);
         int pos = e.lockPos(recid);
         assertEquals(1, e.writeCache[pos].size);
-        e.update(2L, recid,Serializer.LONG);
+        e.update(recid,2L,Serializer.LONG);
         assertEquals(1,e.writeCache[pos].size);
         e.delete(recid,Serializer.LONG);
         assertEquals(1,e.writeCache[pos].size);
