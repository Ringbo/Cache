diff --git a/java/org/apache/catalina/filters/AddDefaultCharsetFilter.java b/java/org/apache/catalina/filters/AddDefaultCharsetFilter.java
index fbddf63..c7469df 100644
--- a/java/org/apache/catalina/filters/AddDefaultCharsetFilter.java
+++ b/java/org/apache/catalina/filters/AddDefaultCharsetFilter.java
@@ -134,7 +134,7 @@
             if (name.trim().equalsIgnoreCase("content-type")) {
                 setContentType(value);
             } else {
-                super.setHeader(name, value);
+                super.addHeader(name, value);
             }
         }
 
