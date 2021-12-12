diff --git a/tpc/src/serializers/XStreamSerializer.java b/tpc/src/serializers/XStreamSerializer.java
index 3cbac83..4fe566b 100644
--- a/tpc/src/serializers/XStreamSerializer.java
+++ b/tpc/src/serializers/XStreamSerializer.java
@@ -77,7 +77,7 @@
     xstream.alias("im", Image.class);
     xstream.registerConverter(new ImageConverter());
 
-    xstream.alias("md", Image.class);
+    xstream.alias("md", Media.class);
     xstream.registerConverter(new MediaConverter());
 
     xstream.alias("mc", MediaContent.class);
