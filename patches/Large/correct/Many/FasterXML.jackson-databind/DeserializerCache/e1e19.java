diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/DeserializerCache.java b/src/main/java/com/fasterxml/jackson/databind/deser/DeserializerCache.java
index 856272f..4b324c5 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/DeserializerCache.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/DeserializerCache.java
@@ -361,7 +361,7 @@
             throw new JsonMappingException("Could not determine Converter parameterization for "
                     +converterType);
         }
-        JavaType delegateType = params[1];
+        JavaType delegateType = params[0];
         return new StdDelegatingDeserializer<Object>(conv, delegateType,
                 _createDeserializer2(ctxt, factory, delegateType, beanDesc));
     }
