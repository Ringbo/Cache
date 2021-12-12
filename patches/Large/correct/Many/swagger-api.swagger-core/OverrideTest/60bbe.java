diff --git a/modules/swagger-core/src/test/java/io/swagger/model/override/OverrideTest.java b/modules/swagger-core/src/test/java/io/swagger/model/override/OverrideTest.java
index 3c15918..08235b2 100644
--- a/modules/swagger-core/src/test/java/io/swagger/model/override/OverrideTest.java
+++ b/modules/swagger-core/src/test/java/io/swagger/model/override/OverrideTest.java
@@ -27,8 +27,8 @@
 
         final Model model = read.get(GenericModel.class.getSimpleName());
         assertTrue(model.getProperties().containsKey(NAME));
-        assertEquals(model.getProperties().get(NAME).getType(), "string");
+        assertEquals("string", model.getProperties().get(NAME).getType());
         assertTrue(model.getProperties().containsKey(COUNT));
-        assertEquals(model.getProperties().get(COUNT).getType(), "integer");
+        assertEquals("integer", model.getProperties().get(COUNT).getType());
     }
 }
