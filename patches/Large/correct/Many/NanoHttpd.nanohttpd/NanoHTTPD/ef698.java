diff --git a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
index b0393b4..b0516b9 100644
--- a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
+++ b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
@@ -969,7 +969,7 @@
                     while (line != null && line.trim().length() > 0) {
                         int p = line.indexOf(':');
                         if (p >= 0)
-                            headers.put(line.substring(0, p).trim().toLowerCase(), line.substring(p + 1).trim());
+                            headers.put(line.substring(0, p).trim().toLowerCase(Locale.US), line.substring(p + 1).trim());
                         line = in.readLine();
                     }
                 }
@@ -999,7 +999,7 @@
                     while (mpline != null && mpline.trim().length() > 0) {
                         int p = mpline.indexOf(':');
                         if (p != -1) {
-                            item.put(mpline.substring(0, p).trim().toLowerCase(), mpline.substring(p + 1).trim());
+                            item.put(mpline.substring(0, p).trim().toLowerCase(Locale.US), mpline.substring(p + 1).trim());
                         }
                         mpline = in.readLine();
                     }
@@ -1014,7 +1014,7 @@
                             String token = st.nextToken();
                             int p = token.indexOf('=');
                             if (p != -1) {
-                                disposition.put(token.substring(0, p).trim().toLowerCase(), token.substring(p + 1).trim());
+                                disposition.put(token.substring(0, p).trim().toLowerCase(Locale.US), token.substring(p + 1).trim());
                             }
                         }
                         String pname = disposition.get("name");
