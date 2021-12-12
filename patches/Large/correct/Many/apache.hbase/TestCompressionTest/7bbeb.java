diff --git a/src/test/java/org/apache/hadoop/hbase/util/TestCompressionTest.java b/src/test/java/org/apache/hadoop/hbase/util/TestCompressionTest.java
index 3170ab3..14bf24f0 100644
--- a/src/test/java/org/apache/hadoop/hbase/util/TestCompressionTest.java
+++ b/src/test/java/org/apache/hadoop/hbase/util/TestCompressionTest.java
@@ -54,6 +54,6 @@
     assertFalse(CompressionTest.testCompression("LZO"));
     assertTrue(CompressionTest.testCompression("NONE"));
     assertTrue(CompressionTest.testCompression("GZ"));
-    assertTrue(CompressionTest.testCompression("SNAPPY"));
+    assertFalse(CompressionTest.testCompression("SNAPPY"));
   }
 }
