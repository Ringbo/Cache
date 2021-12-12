diff --git a/core/src/test/java/io/grpc/MetadataTest.java b/core/src/test/java/io/grpc/MetadataTest.java
index c263e29..10d7335 100644
--- a/core/src/test/java/io/grpc/MetadataTest.java
+++ b/core/src/test/java/io/grpc/MetadataTest.java
@@ -153,7 +153,7 @@
     assertFalse(fishes.hasNext());
     byte[][] serialized = metadata.serialize();
     assertEquals(2, serialized.length);
-    assertEquals(new String(serialized[0], US_ASCII), "test-bin");
+    assertEquals("test-bin", new String(serialized[0], US_ASCII));
     assertArrayEquals(LANCE_BYTES, serialized[1]);
     assertEquals(lance, metadata.get(KEY));
     assertEquals(serialized[0], metadata.serialize()[0]);
