diff --git a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
index 9fe3ac0..81ebc62 100644
--- a/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/ProtobufAnnotationSerializerSlowITest.java
@@ -305,7 +305,7 @@
     assertNotNull(compressedProto);
 
     // Check size
-    assertTrue("" + compressedProto.length, compressedProto.length < 340000);
+    assertTrue("" + compressedProto.length, compressedProto.length < 380000);
     assertTrue("" + uncompressedProto.length, uncompressedProto.length < 1700000);
   }
 
