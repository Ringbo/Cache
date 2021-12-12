diff --git a/src/main/java/org/jboss/netty/handler/codec/http/CookieDecoder.java b/src/main/java/org/jboss/netty/handler/codec/http/CookieDecoder.java
index b810f75..62d9e30 100644
--- a/src/main/java/org/jboss/netty/handler/codec/http/CookieDecoder.java
+++ b/src/main/java/org/jboss/netty/handler/codec/http/CookieDecoder.java
@@ -81,8 +81,7 @@
             // An exceptional case:
             // 'Expires' attribute can contain a comma without surrounded with quotes.
             if (name.equalsIgnoreCase(CookieHeaderNames.EXPIRES) &&
-                value.length() <= 3) {
-                // value contains comma, but not surrounded with quotes.
+                value.length() <= 9) { // Longest day of week is 'Wednesday'.
                 if (m.find(pos)) {
                     value = value + ", " + m.group(1);
                     pos = m.end();
