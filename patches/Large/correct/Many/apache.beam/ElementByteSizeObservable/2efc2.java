diff --git a/runners/core-java/src/main/java/org/apache/beam/runners/core/ElementByteSizeObservable.java b/runners/core-java/src/main/java/org/apache/beam/runners/core/ElementByteSizeObservable.java
index 2380ba9..63b9f25 100644
--- a/runners/core-java/src/main/java/org/apache/beam/runners/core/ElementByteSizeObservable.java
+++ b/runners/core-java/src/main/java/org/apache/beam/runners/core/ElementByteSizeObservable.java
@@ -32,13 +32,12 @@
    * {@code ElementByteSizeObservable} can calculate the byte size of
    * the element to be coded in roughly constant time (or lazily).
    */
-  public boolean isRegisterByteSizeObserverCheap(T value);
+  boolean isRegisterByteSizeObserverCheap(T value);
 
   /**
    * Notifies the {@code ElementByteSizeObserver} about the byte size
    * of the encoded value using this {@code ElementByteSizeObservable}.
    */
-  public void registerByteSizeObserver(T value,
-                                       ElementByteSizeObserver observer)
+  void registerByteSizeObserver(T value, ElementByteSizeObserver observer)
       throws Exception;
 }
