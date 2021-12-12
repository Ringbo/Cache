diff --git a/ion/src/com/koushikdutta/ion/gson/GsonParser.java b/ion/src/com/koushikdutta/ion/gson/GsonParser.java
index d1b6008..de1fc08 100644
--- a/ion/src/com/koushikdutta/ion/gson/GsonParser.java
+++ b/ion/src/com/koushikdutta/ion/gson/GsonParser.java
@@ -30,7 +30,7 @@
             protected void transform(ByteBufferList result) throws Exception {
                 JsonParser parser = new JsonParser();
                 T parsed = (T)parser.parse(new JsonReader(new InputStreamReader(new ByteBufferListInputStream(result))));
-                if (parsed.isJsonNull())
+                if (parsed.isJsonNull() || parsed.isJsonPrimitive())
                     throw new JsonParseException("unable to parse json");
                 setComplete(null, parsed);
             }
