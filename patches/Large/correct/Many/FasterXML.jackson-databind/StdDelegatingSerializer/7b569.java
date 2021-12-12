diff --git a/src/main/java/com/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer.java b/src/main/java/com/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer.java
index f178b06..3a541bc 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer.java
@@ -125,8 +125,7 @@
         }
         // and then find the thing...
         return withDelegate(_converter, delegateType,
-//                provider.findValueSerializer(delegateType, property));
-                provider.findValueSerializer(delegateType));
+                provider.findValueSerializer(delegateType, property));
     }
 
     /*
