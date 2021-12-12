diff --git a/retrofit-converters/wire/src/main/java/retrofit/converter/WireConverter.java b/retrofit-converters/wire/src/main/java/retrofit/converter/WireConverter.java
index 0467696..3f5c7e8 100644
--- a/retrofit-converters/wire/src/main/java/retrofit/converter/WireConverter.java
+++ b/retrofit-converters/wire/src/main/java/retrofit/converter/WireConverter.java
@@ -37,7 +37,7 @@
     }
 
     if (!MIME_TYPE.equalsIgnoreCase(body.mimeType())) {
-      throw new IllegalArgumentException("Expected a proto but was: " + body.mimeType());
+      throw new ConversionException("Expected a proto but was: " + body.mimeType());
     }
 
     InputStream in = null;
