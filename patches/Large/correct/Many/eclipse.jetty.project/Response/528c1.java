diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/Response.java b/jetty-server/src/main/java/org/eclipse/jetty/server/Response.java
index 87a0fef..819ed2d 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/Response.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/Response.java
@@ -347,7 +347,10 @@
         for(; i<valueLen; i++)
         {
             char c = value.charAt(i);
-            if (c <= 0x1F)
+            
+            // 0x00 - 0x1F are low order control characters
+            // 0x7F is the DEL control character
+            if ((c <= 0x1F) || (c == 0x7F))
                 throw new IllegalArgumentException("Control characters not allowed in RFC6265 Cookie value");
             if ((c == ' ' /* 0x20 */) ||
                 (c == '"' /* 0x2C */) ||
@@ -356,7 +359,7 @@
             {
                 throw new IllegalArgumentException("RFC6265 Cookie value may not contain character: [" + c + "]");
             }
-            if (c >= 0x7F)
+            if (c >= 0x80)
                 throw new IllegalArgumentException("RFC6265 Cookie value characters restricted to US-ASCII range: 0x" + Integer.toHexString(c));
         }
     }
