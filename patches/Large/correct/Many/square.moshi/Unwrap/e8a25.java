diff --git a/examples/src/main/java/com/squareup/moshi/recipes/Unwrap.java b/examples/src/main/java/com/squareup/moshi/recipes/Unwrap.java
index bd19b8f..6f1f108 100644
--- a/examples/src/main/java/com/squareup/moshi/recipes/Unwrap.java
+++ b/examples/src/main/java/com/squareup/moshi/recipes/Unwrap.java
@@ -88,7 +88,7 @@
     }
 
     @Override public void toJson(JsonWriter writer, Object value) throws IOException {
-      delegate.toJson(new Envelope<>(value));
+      delegate.toJson(writer, new Envelope<>(value));
     }
   }
 }
