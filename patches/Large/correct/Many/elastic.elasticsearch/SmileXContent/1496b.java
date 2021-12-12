diff --git a/src/main/java/org/elasticsearch/common/xcontent/smile/SmileXContent.java b/src/main/java/org/elasticsearch/common/xcontent/smile/SmileXContent.java
index 6bf4b38..7dfdb62 100644
--- a/src/main/java/org/elasticsearch/common/xcontent/smile/SmileXContent.java
+++ b/src/main/java/org/elasticsearch/common/xcontent/smile/SmileXContent.java
@@ -30,7 +30,7 @@
 import java.io.*;
 
 /**
- * A JSON based content implementation using Jackson.
+ * A Smile based content implementation using Jackson.
  */
 public class SmileXContent implements XContent {
 
@@ -100,6 +100,6 @@
 
     @Override
     public XContentParser createParser(Reader reader) throws IOException {
-        return new JsonXContentParser(smileFactory.createParser(reader));
+        return new SmileXContentParser(smileFactory.createParser(reader));
     }
 }
