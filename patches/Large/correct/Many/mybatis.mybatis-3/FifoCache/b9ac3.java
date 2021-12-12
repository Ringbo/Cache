diff --git a/src/main/java/org/apache/ibatis/cache/decorators/FifoCache.java b/src/main/java/org/apache/ibatis/cache/decorators/FifoCache.java
index 42e9a4e..c7f3808 100644
--- a/src/main/java/org/apache/ibatis/cache/decorators/FifoCache.java
+++ b/src/main/java/org/apache/ibatis/cache/decorators/FifoCache.java
@@ -26,7 +26,7 @@
 public class FifoCache implements Cache {
 
   private final Cache delegate;
-  private final LinkedList<Object> keyList;
+  private LinkedList<Object> keyList;
   private int size;
 
   public FifoCache(Cache delegate) {
@@ -62,7 +62,7 @@
 
   public void clear() {
     delegate.clear();
-    keyList.clear();
+    keyList = new LinkedList<Object>(); // see #138
   }
 
   public ReadWriteLock getReadWriteLock() {
