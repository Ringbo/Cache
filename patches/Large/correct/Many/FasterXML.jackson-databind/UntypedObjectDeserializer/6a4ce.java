diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java
index 7e47682..140f15d 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java
@@ -113,7 +113,11 @@
             if (ctxt.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                 return jp.getBigIntegerValue();
             }
-            return jp.getIntValue();
+            /* and as per [JACKSON-839], allow "upgrade" to bigger types: out-of-range
+             * entries can not be produced without type, so this should "just work",
+             * even if it is bit unclean
+             */
+            return jp.getNumberValue();
 
         case VALUE_NUMBER_FLOAT:
             // For [JACKSON-72], see above
