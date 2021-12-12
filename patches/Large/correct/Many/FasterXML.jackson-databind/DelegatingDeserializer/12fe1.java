diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/std/DelegatingDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/std/DelegatingDeserializer.java
index 92491e3..f436878 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/std/DelegatingDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/std/DelegatingDeserializer.java
@@ -34,7 +34,7 @@
 
     public DelegatingDeserializer(JsonDeserializer<?> d)
     {
-        super(d.getClass());
+        super(d.handledType());
         _delegatee = d;
     }
 
