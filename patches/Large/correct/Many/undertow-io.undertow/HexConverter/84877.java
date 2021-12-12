diff --git a/core/src/main/java/io/undertow/util/HexConverter.java b/core/src/main/java/io/undertow/util/HexConverter.java
index d461a96..eb1e0a6 100644
--- a/core/src/main/java/io/undertow/util/HexConverter.java
+++ b/core/src/main/java/io/undertow/util/HexConverter.java
@@ -135,7 +135,7 @@
 
         byte[] convertedBack = convertFromHex(hexValue);
 
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         for (byte current : convertedBack) {
             sb.append((int)current).append(" ");
         }
