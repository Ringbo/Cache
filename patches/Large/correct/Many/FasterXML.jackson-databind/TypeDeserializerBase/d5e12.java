diff --git a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/TypeDeserializerBase.java b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/TypeDeserializerBase.java
index 5795200..bcd35e2 100644
--- a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/TypeDeserializerBase.java
+++ b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/TypeDeserializerBase.java
@@ -74,8 +74,8 @@
         // 22-Dec-2015, tatu: as per [databind#1055], avoid NPE
         _typePropertyName = (typePropertyName == null) ? "" : typePropertyName;
         _typeIdVisible = typeIdVisible;
-        // defaults are fine, although concurrency of 4 bit more frugal than 16:
-        _deserializers = new ConcurrentHashMap<String, JsonDeserializer<Object>>(16, 0.75f, 4);
+        // defaults are fine, although shouldn't need much concurrency
+        _deserializers = new ConcurrentHashMap<String, JsonDeserializer<Object>>(16, 0.75f, 2);
         if (defaultImpl == null) {
             _defaultImpl = null;
         } else {
@@ -84,6 +84,8 @@
              *    seldom (if ever) base types, may be ok.
              */
             // 01-Nov-2015, tatu: Actually this is still exactly wrong. Should fix.
+            // 15-Jan-2016, tatu: ... as witnessed by [databind#1083], patched, but
+            //     fundamentally this call can't be made to work for all cases
             _defaultImpl = baseType.forcedNarrowBy(defaultImpl);
         }
         _property = null;
