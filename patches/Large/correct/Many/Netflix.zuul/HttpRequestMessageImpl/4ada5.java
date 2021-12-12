diff --git a/zuul-core/src/main/java/com/netflix/zuul/message/http/HttpRequestMessageImpl.java b/zuul-core/src/main/java/com/netflix/zuul/message/http/HttpRequestMessageImpl.java
index 96f11b1..0f85e5c 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/message/http/HttpRequestMessageImpl.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/message/http/HttpRequestMessageImpl.java
@@ -243,7 +243,7 @@
     {
         Cookies cookies = new Cookies();
         for (String aCookieHeader : getHeaders().get("cookie")) {
-            Set<Cookie> decode = CookieDecoder.decode(aCookieHeader);
+            Set<Cookie> decode = CookieDecoder.decode(aCookieHeader, false);
             for (Cookie cookie : decode) {
                 cookies.add(cookie);
             }
