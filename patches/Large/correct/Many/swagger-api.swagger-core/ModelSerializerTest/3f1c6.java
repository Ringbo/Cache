diff --git a/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java b/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java
index adbdcec..07b33c3 100644
--- a/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java
+++ b/modules/swagger-core/src/test/java/io/swagger/ModelSerializerTest.java
@@ -324,7 +324,7 @@
 
         final ModelImpl model = Json.mapper().readValue(json, ModelImpl.class);
 
-        assertTrue(model.getUniqueItems());
+        assertFalse(model.getUniqueItems());
     }
 
     @Test
@@ -336,6 +336,6 @@
 
         final ModelImpl model = Json.mapper().readValue(json, ModelImpl.class);
 
-        assertFalse(model.getUniqueItems());
+        assertTrue(model.getUniqueItems());
     }
 }
\ No newline at end of file
