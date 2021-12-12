diff --git a/src/main/java/org/jsoup/helper/HttpConnection.java b/src/main/java/org/jsoup/helper/HttpConnection.java
index 17459f7..5502106 100644
--- a/src/main/java/org/jsoup/helper/HttpConnection.java
+++ b/src/main/java/org/jsoup/helper/HttpConnection.java
@@ -286,7 +286,7 @@
         }
 
         public String cookie(String name) {
-            Validate.notNull(name, "Cookie name must not be null");
+            Validate.notEmpty(name, "Cookie name must not be empty");
             return cookies.get(name);
         }
 
@@ -298,12 +298,12 @@
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
