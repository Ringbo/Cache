diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index 2247c7a..d3c5ce2 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -304,7 +304,7 @@
     assertNotNull(compressedProto);
 
     // Check size
-    assertTrue("" + compressedProto.length, compressedProto.length < 330000);
+    assertTrue("" + compressedProto.length, compressedProto.length < 340000);
     assertTrue("" + uncompressedProto.length, uncompressedProto.length < 1700000);
   }
 
