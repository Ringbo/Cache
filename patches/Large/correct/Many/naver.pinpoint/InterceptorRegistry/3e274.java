diff --git a/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/interceptor/InterceptorRegistry.java b/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/interceptor/InterceptorRegistry.java
index 7e64485..790e2cd 100644
--- a/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/interceptor/InterceptorRegistry.java
+++ b/bootstrap/src/main/java/com/navercorp/pinpoint/bootstrap/interceptor/InterceptorRegistry.java
@@ -13,7 +13,7 @@
 
     public static final InterceptorRegistry REGISTRY = new InterceptorRegistry();
 
-    private final static int DEFAULT_MAX = 1024;
+    private final static int DEFAULT_MAX = 4096;
     private final int max;
 
     private final AtomicInteger id = new AtomicInteger(0);
@@ -38,7 +38,7 @@
             return -1;
         }
         int newId = nextId();
-        if (newId > max) {
+        if (newId >= max) {
             throw new IndexOutOfBoundsException("size=" + index.length + " id=" + id);
         }
 
@@ -56,7 +56,7 @@
             return -1;
         }
         int newId = nextId();
-        if (newId > max) {
+        if (newId >= max) {
             throw new IndexOutOfBoundsException("size=" + index.length + " id=" + id);
         }
 
