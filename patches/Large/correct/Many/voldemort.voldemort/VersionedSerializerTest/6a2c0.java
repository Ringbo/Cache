diff --git a/test/unit/voldemort/serialization/VersionedSerializerTest.java b/test/unit/voldemort/serialization/VersionedSerializerTest.java
index 3b7d5ec..aeb2387 100644
--- a/test/unit/voldemort/serialization/VersionedSerializerTest.java
+++ b/test/unit/voldemort/serialization/VersionedSerializerTest.java
@@ -30,7 +30,7 @@
     }
 
     private void assertSerializes(String message, Versioned<String> obj) {
-        assertEquals(obj, this.serializer.toObject(this.serializer.toBytes(obj)));
+        assertEquals(message, obj, this.serializer.toObject(this.serializer.toBytes(obj)));
     }
 
     public void testSerialization() {
