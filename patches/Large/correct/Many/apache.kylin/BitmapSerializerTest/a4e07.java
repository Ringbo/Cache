diff --git a/core-metadata/src/test/java/org/apache/kylin/measure/bitmap/BitmapSerializerTest.java b/core-metadata/src/test/java/org/apache/kylin/measure/bitmap/BitmapSerializerTest.java
index bcb1406..076302c 100644
--- a/core-metadata/src/test/java/org/apache/kylin/measure/bitmap/BitmapSerializerTest.java
+++ b/core-metadata/src/test/java/org/apache/kylin/measure/bitmap/BitmapSerializerTest.java
@@ -51,7 +51,7 @@
 
         buffer.position(0);
         assertEquals(len, deSerializer.peekLength(buffer));
-        assertEquals(32 * 1024 * 1024, deSerializer.maxLength());
+        assertEquals(8 * 1024 * 1024, deSerializer.maxLength());
         System.out.println("counter size " + deSerializer.getStorageBytesEstimate());
     }
 }
\ No newline at end of file
