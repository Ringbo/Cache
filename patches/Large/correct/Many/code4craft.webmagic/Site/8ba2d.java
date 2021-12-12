diff --git a/webmagic-core/src/main/java/us/codecraft/webmagic/Site.java b/webmagic-core/src/main/java/us/codecraft/webmagic/Site.java
index 3a5dd33..4c84fb3 100644
--- a/webmagic-core/src/main/java/us/codecraft/webmagic/Site.java
+++ b/webmagic-core/src/main/java/us/codecraft/webmagic/Site.java
@@ -123,7 +123,7 @@
      * @return get cookies
      */
     public Map<String,Map<String, String>> getAllCookies() {
-        return cookies.columnMap();
+        return cookies.rowMap();
     }
 
     /**
