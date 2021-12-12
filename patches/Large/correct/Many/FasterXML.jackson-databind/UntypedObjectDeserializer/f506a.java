diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java
index 38637e6..7f4e220 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer.java
@@ -255,13 +255,12 @@
             if (_numberDeserializer != null) {
                 return _numberDeserializer.deserialize(p, ctxt);
             }
-            /* [JACKSON-72]: need to allow overriding the behavior regarding
-             *   which type to use
-             */
+            // Need to allow overriding the behavior regarding which type to use
             if (ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                 return p.getDecimalValue();
             }
-            return p.getDoubleValue();
+            // as per [databind#1453] should not assume Double but:
+            return p.getNumberValue();
 
         case JsonTokenId.ID_TRUE:
             return Boolean.TRUE;
@@ -319,7 +318,7 @@
             if (ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                 return p.getDecimalValue();
             }
-            return Double.valueOf(p.getDoubleValue());
+            return p.getNumberValue();
 
         case JsonTokenId.ID_TRUE:
             return Boolean.TRUE;
@@ -523,7 +522,7 @@
                 if (ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                     return p.getDecimalValue();
                 }
-                return Double.valueOf(p.getDoubleValue());
+                return p.getNumberValue();
 
             case JsonTokenId.ID_TRUE:
                 return Boolean.TRUE;
@@ -566,7 +565,7 @@
                 if (ctxt.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                     return p.getDecimalValue();
                 }
-                return Double.valueOf(p.getDoubleValue());
+                return p.getNumberValue();
 
             case JsonTokenId.ID_TRUE:
                 return Boolean.TRUE;
