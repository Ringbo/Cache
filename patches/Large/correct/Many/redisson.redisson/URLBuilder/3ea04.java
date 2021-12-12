diff --git a/redisson/src/main/java/org/redisson/misc/URLBuilder.java b/redisson/src/main/java/org/redisson/misc/URLBuilder.java
index 3c6f0f5..f7c676d 100644
--- a/redisson/src/main/java/org/redisson/misc/URLBuilder.java
+++ b/redisson/src/main/java/org/redisson/misc/URLBuilder.java
@@ -77,7 +77,7 @@
             Field field = URL.class.getDeclaredField("factory");
             field.setAccessible(true);
             currentFactory = (URLStreamHandlerFactory) field.get(null);
-            if (currentFactory != null) {
+            if (currentFactory != null && currentFactory != newFactory) {
                 field.set(null, null);
             }
             
