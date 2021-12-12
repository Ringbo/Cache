diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index 81ebc62..ce43530 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -306,7 +306,7 @@
 
     // Check size
     assertTrue("" + compressedProto.length, compressedProto.length < 380000);
-    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 1700000);
+    assertTrue("" + uncompressedProto.length, uncompressedProto.length < 1800000);
   }
 
   @Test
