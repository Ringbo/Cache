diff --git a/src/main/java/com/fasterxml/jackson/databind/ser/std/MapSerializer.java b/src/main/java/com/fasterxml/jackson/databind/ser/std/MapSerializer.java
index 051f4e9..cab2d54 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ser/std/MapSerializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ser/std/MapSerializer.java
@@ -187,7 +187,7 @@
             JsonSerializer<Object> keySerializer, JsonSerializer<Object> valueSerializer)
     {
         return construct(ignoredList, mapType, staticValueType, vts,
-                keySerializer, valueSerializer);
+                keySerializer, valueSerializer, null);
     }
 
     /**
