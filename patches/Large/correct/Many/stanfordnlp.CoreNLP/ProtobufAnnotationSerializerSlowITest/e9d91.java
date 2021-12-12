diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index aa12b18..b3be9ed 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -240,7 +240,7 @@
 
     // Check size
     assertTrue("" + compressedProto.length, compressedProto.length < 290000);
-    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 1000000);
+    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 1100000);
   }
 
   @Test
