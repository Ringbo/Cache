diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/io/AvroIOTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/io/AvroIOTest.java
index 1b1b1fa..4825875 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/io/AvroIOTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/io/AvroIOTest.java
@@ -178,7 +178,7 @@
     p.run();
     DataFileStream dataFileStream = new DataFileStream(new FileInputStream(outputFile),
         new GenericDatumReader());
-    assertEquals(dataFileStream.getMetaString("avro.codec"), "deflate");
+    assertEquals("deflate", dataFileStream.getMetaString("avro.codec"));
   }
 
   @Test
@@ -207,7 +207,7 @@
     p.run();
     DataFileStream dataFileStream = new DataFileStream(new FileInputStream(outputFile),
         new GenericDatumReader());
-    assertEquals(dataFileStream.getMetaString("avro.codec"), "null");
+    assertEquals("null", dataFileStream.getMetaString("avro.codec"));
   }
 
   @DefaultCoder(AvroCoder.class)
@@ -280,7 +280,7 @@
   public void testWriteWithDefaultCodec() throws Exception {
     AvroIO.Write.Bound<GenericRecord> write = AvroIO.Write
         .to("gs://bucket/foo/baz");
-    assertEquals(write.getCodec().toString(), CodecFactory.deflateCodec(6).toString());
+    assertEquals(CodecFactory.deflateCodec(6).toString(), write.getCodec().toString());
   }
 
   @Test
@@ -288,7 +288,7 @@
     AvroIO.Write.Bound<GenericRecord> write = AvroIO.Write
         .to("gs://bucket/foo/baz")
         .withCodec(CodecFactory.snappyCodec());
-    assertEquals(write.getCodec().toString(), SNAPPY_CODEC);
+    assertEquals(SNAPPY_CODEC, write.getCodec().toString());
   }
 
   @Test
@@ -300,7 +300,7 @@
 
     AvroIO.Write.Bound<GenericRecord> serdeWrite = SerializableUtils.clone(write);
 
-    assertEquals(serdeWrite.getCodec().toString(), CodecFactory.deflateCodec(9).toString());
+    assertEquals(CodecFactory.deflateCodec(9).toString(), serdeWrite.getCodec().toString());
   }
 
   @Test
@@ -312,7 +312,7 @@
 
     AvroIO.Write.Bound<GenericRecord> serdeWrite = SerializableUtils.clone(write);
 
-    assertEquals(serdeWrite.getCodec().toString(), CodecFactory.xzCodec(9).toString());
+    assertEquals(CodecFactory.xzCodec(9).toString(), serdeWrite.getCodec().toString());
   }
 
   @SuppressWarnings("deprecation") // using AvroCoder#createDatumReader for tests.
