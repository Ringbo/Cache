diff --git a/src/main/java/org/jsoup/helper/HttpConnection.java b/src/main/java/org/jsoup/helper/HttpConnection.java
index 4940470..d756338 100644
--- a/src/main/java/org/jsoup/helper/HttpConnection.java
+++ b/src/main/java/org/jsoup/helper/HttpConnection.java
@@ -283,7 +283,7 @@
         }
 
         public String cookie(String name) {
-            Validate.notNull(name, "Cookie name must not be null");
+            Validate.notEmpty(name, "Cookie name must not be empty");
             return cookies.get(name);
         }
 
@@ -295,12 +295,12 @@
         }
 
         public boolean hasCookie(String name) {
-            Validate.notEmpty("Cookie name must not be empty");
+            Validate.notEmpty(name, "Cookie name must not be empty");
             return cookies.containsKey(name);
         }
 
         public T removeCookie(String name) {
-            Validate.notEmpty("Cookie name must not be empty");
+            Validate.notEmpty(name, "Cookie name must not be empty");
             cookies.remove(name);
             return (T) this;
         }
