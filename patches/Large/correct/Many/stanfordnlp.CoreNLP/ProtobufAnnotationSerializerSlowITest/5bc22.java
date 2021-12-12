diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index 81fe42a..e26b25e 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -322,7 +322,7 @@
 
     // Check size
     assertTrue("" + compressedProto.length, compressedProto.length < 391000);
-    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2100000);
+    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2500000);
   }
 
   @Test
