diff --git a/lang/java/src/java/org/apache/avro/specific/SpecificData.java b/lang/java/src/java/org/apache/avro/specific/SpecificData.java
index d4adcfc..7b7caaa 100644
--- a/lang/java/src/java/org/apache/avro/specific/SpecificData.java
+++ b/lang/java/src/java/org/apache/avro/specific/SpecificData.java
@@ -70,7 +70,7 @@
         classCache.put(name, c);
       }
       return c == NO_CLASS ? null : c;
-    case ARRAY:   return Collection.class;
+    case ARRAY:   return List.class;
     case MAP:     return Map.class;
     case UNION:
       List<Schema> types = schema.getTypes();     // elide unions with null
