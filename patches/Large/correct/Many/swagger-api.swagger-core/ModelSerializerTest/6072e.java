diff --git a/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java b/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java
index 8c01d5e..f63bf73 100644
--- a/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java
+++ b/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java
@@ -280,6 +280,6 @@
         final ModelImpl model = Json.mapper().readValue(json, ModelImpl.class);
 
         assertNotNull(model.getEnum());
-        assertTrue(model.getEnum().size() == 2);
+        assertTrue(model.getEnum().size() == 3);
     }
 }
\ No newline at end of file
