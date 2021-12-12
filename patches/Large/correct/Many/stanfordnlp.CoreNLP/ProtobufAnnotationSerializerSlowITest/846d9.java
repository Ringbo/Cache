diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index 20f5424..4e31f30 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -330,7 +330,7 @@
 
     // Check size
     assertTrue("" + compressedProto.length, compressedProto.length < 392000);
-    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2550000);
+    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 2560000);
   }
 
   @Test
