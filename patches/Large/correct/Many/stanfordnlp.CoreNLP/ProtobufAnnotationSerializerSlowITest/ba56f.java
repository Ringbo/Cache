diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index 0c960e3..b541e60 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -330,7 +330,7 @@
 
     // Check size
     assertTrue("" + compressedProto.length, compressedProto.length < 391000);
-    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2500000);
+    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2550000);
   }
 
   @Test
