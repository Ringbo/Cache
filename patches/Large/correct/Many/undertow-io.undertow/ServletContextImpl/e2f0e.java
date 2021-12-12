diff --git a/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java b/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java
index 30b4b17..12113e5 100644
--- a/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java
+++ b/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java
@@ -196,7 +196,7 @@
         if(file == null) {
             return null;
         }
-        String lower = file.toLowerCase();
+        String lower = file.toLowerCase(Locale.ENGLISH);
         int pos = lower.lastIndexOf('.');
         if (pos == -1) {
             return deployment.getMimeExtensionMappings().get(lower);
