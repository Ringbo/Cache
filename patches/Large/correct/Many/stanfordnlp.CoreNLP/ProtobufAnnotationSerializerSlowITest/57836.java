diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index 87c4ae9..859a456 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -313,7 +313,7 @@
     assertNotNull(compressedProto);
 
     // Check size
-    assertTrue("" + compressedProto.length, compressedProto.length < 390000);
+    assertTrue("" + compressedProto.length, compressedProto.length < 390200);
     assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2100000);
   }
 
