diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/io/SerializableAvroCodecFactoryTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/io/SerializableAvroCodecFactoryTest.java
index 3fe8740..d367d8c 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/io/SerializableAvroCodecFactoryTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/io/SerializableAvroCodecFactoryTest.java
@@ -50,7 +50,7 @@
       SerializableAvroCodecFactory codecFactory = new SerializableAvroCodecFactory(
           CodecFactory.fromString(codec));
 
-      assertEquals(codecFactory.getCodec().toString(), (CodecFactory.fromString(codec).toString()));
+      assertEquals((CodecFactory.fromString(codec).toString()), codecFactory.getCodec().toString());
     }
   }
 
@@ -62,7 +62,7 @@
 
       SerializableAvroCodecFactory serdeC = SerializableUtils.clone(codecFactory);
 
-      assertEquals(serdeC.getCodec().toString(), CodecFactory.fromString(codec).toString());
+      assertEquals(CodecFactory.fromString(codec).toString(), serdeC.getCodec().toString());
     }
   }
 
@@ -74,7 +74,7 @@
 
       SerializableAvroCodecFactory serdeC = SerializableUtils.clone(codecFactory);
 
-      assertEquals(serdeC.getCodec().toString(), CodecFactory.deflateCodec(i).toString());
+      assertEquals(CodecFactory.deflateCodec(i).toString(), serdeC.getCodec().toString());
     }
   }
 
@@ -86,7 +86,7 @@
 
       SerializableAvroCodecFactory serdeC = SerializableUtils.clone(codecFactory);
 
-      assertEquals(serdeC.getCodec().toString(), CodecFactory.xzCodec(i).toString());
+      assertEquals(CodecFactory.xzCodec(i).toString(), serdeC.getCodec().toString());
     }
   }
 
