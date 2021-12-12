diff --git a/src/test/java/com/fasterxml/jackson/failing/ReadWriteOnlyProp935Test.java b/src/test/java/com/fasterxml/jackson/failing/ReadWriteOnlyProp935Test.java
index afb93ab..b241e73 100644
--- a/src/test/java/com/fasterxml/jackson/failing/ReadWriteOnlyProp935Test.java
+++ b/src/test/java/com/fasterxml/jackson/failing/ReadWriteOnlyProp935Test.java
@@ -65,7 +65,7 @@
 
         ReadXWriteY result = MAPPER.readValue("{\"x\":5, \"y\":6}", ReadXWriteY.class);
         assertNotNull(result);
-        assertEquals(0, result.x);
+        assertEquals(1, result.x);
         assertEquals(6, result.y);
     }
 
