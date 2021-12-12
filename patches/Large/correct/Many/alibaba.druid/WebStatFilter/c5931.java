diff --git a/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java b/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java
index f95525b..cca0018 100644
--- a/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java
+++ b/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java
@@ -265,7 +265,7 @@
             return sessionValue.toString();
         }
 
-        if (principalCookieName != null) {
+        if (principalCookieName != null && httpRequest.getCookies() != null) {
             for (Cookie cookie : httpRequest.getCookies()) {
                 if (principalCookieName.equals(cookie.getName())) {
                     return cookie.getValue();
