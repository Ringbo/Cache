diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
index 2aabc48..7fdacdd 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
@@ -613,19 +613,19 @@
                 .append(status)
                 .append(" ")
                 .append(statusMessage)
-                .append("\n");
+                .append("\r\n");
 
-        b.append("Content-Type").append(":").append(headers.get("Content-Type") == null ? contentType : headers.get("Content-Type")).append("\n");
+        b.append("Content-Type").append(":").append(headers.get("Content-Type") == null ? contentType : headers.get("Content-Type")).append("\r\n");
         if (contentLength != -1) {
-            b.append("Content-Length").append(":").append(contentLength).append("\n");
+            b.append("Content-Length").append(":").append(contentLength).append("\r\n");
         }
 
         for (String s : headers().keySet()) {
             if (!s.equalsIgnoreCase("Content-Type")) {
-                b.append(s).append(":").append(headers.get(s)).append("\n");
+                b.append(s).append(":").append(headers.get(s)).append("\r\n");
             }
         }
-        b.deleteCharAt(b.length() - 1);
+        b.deleteCharAt(b.length() - 2);
         b.append("\r\n\r\n");
         return b.toString();
     }
