diff --git a/serde/src/java/org/apache/hadoop/hive/serde2/SerDeUtils.java b/serde/src/java/org/apache/hadoop/hive/serde2/SerDeUtils.java
index 40ede1a..c65174e 100644
--- a/serde/src/java/org/apache/hadoop/hive/serde2/SerDeUtils.java
+++ b/serde/src/java/org/apache/hadoop/hive/serde2/SerDeUtils.java
@@ -555,6 +555,6 @@
   }
 
   public static Text transformTextFromUTF8(Text text, Charset targetCharset) {
-    return new Text(new String(text.getBytes()).getBytes(targetCharset));
+    return new Text(new String(text.getBytes(), 0, text.getLength()).getBytes(targetCharset));
   }
 }
