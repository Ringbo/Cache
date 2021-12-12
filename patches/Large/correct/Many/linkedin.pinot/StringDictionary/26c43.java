diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/readers/StringDictionary.java b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/readers/StringDictionary.java
index b8ae759..1905646 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/readers/StringDictionary.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/segment/index/readers/StringDictionary.java
@@ -59,7 +59,7 @@
     byte[] bytes = val.getBytes(UTF_8);
     for (int i = 0; i < lengthofMaxEntry; i++) {
       if (bytes[i] == STRING_PAD_CHAR) {
-        return new String(bytes, 0, i);
+        return new String(bytes, 0, i, UTF_8);
       }
     }
     return val;
