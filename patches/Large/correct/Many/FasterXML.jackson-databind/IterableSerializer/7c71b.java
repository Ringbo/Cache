diff --git a/src/main/java/com/fasterxml/jackson/databind/ser/std/IterableSerializer.java b/src/main/java/com/fasterxml/jackson/databind/ser/std/IterableSerializer.java
index d9d7d27..aa65e10 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ser/std/IterableSerializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ser/std/IterableSerializer.java
@@ -43,7 +43,7 @@
     @Override
     public boolean isEmpty(Iterable<?> value) {
         // Not really good way to implement this, but has to do for now:
-        return (value == null) || value.iterator().hasNext();
+        return (value == null) || !value.iterator().hasNext();
     }
 
     @Override
