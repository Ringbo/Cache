diff --git a/platform/util/src/com/intellij/util/pico/DefaultPicoContainer.java b/platform/util/src/com/intellij/util/pico/DefaultPicoContainer.java
index 08a8c47..c7dc592 100644
--- a/platform/util/src/com/intellij/util/pico/DefaultPicoContainer.java
+++ b/platform/util/src/com/intellij/util/pico/DefaultPicoContainer.java
@@ -352,7 +352,7 @@
     private final ConcurrentHashMap<T, T> concurrentSet = new ConcurrentHashMap<T, T>();
     
     public boolean contains(@Nullable T element) {
-      return element != null || concurrentSet.containsKey(element);
+      return element != null && concurrentSet.containsKey(element);
     }
     
     public void add(@NotNull T element) {
