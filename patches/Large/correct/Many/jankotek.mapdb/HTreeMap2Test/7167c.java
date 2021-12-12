diff --git a/src/test/java/org/mapdb/HTreeMap2Test.java b/src/test/java/org/mapdb/HTreeMap2Test.java
index 46551a9..1d0b0a7 100644
--- a/src/test/java/org/mapdb/HTreeMap2Test.java
+++ b/src/test/java/org/mapdb/HTreeMap2Test.java
@@ -125,7 +125,7 @@
         HTreeMap.LinkedNode n2  = (HTreeMap.LinkedNode) serializer.deserialize(in, -1);
 
         assertEquals(123456, n2.next);
-        assertEquals(1111L, n2.expireLinkNodeRecid);
+        assertEquals(0L, n2.expireLinkNodeRecid);
         assertEquals(123L,n2.key);
         assertEquals(456L,n2.value);
     }
