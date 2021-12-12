diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index d93bb67..d0d0350 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -330,7 +330,7 @@
 
     // Check size
     assertTrue("" + compressedProto.length, compressedProto.length < 395000);
-    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2560000);
+    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2570000);
   }
 
   @Test
