diff --git a/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamPassThrough.java b/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamPassThrough.java
index 59a815b..adf8e38 100644
--- a/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamPassThrough.java
+++ b/streams/src/main/java/org/apache/kafka/streams/kstream/internals/KStreamPassThrough.java
@@ -25,10 +25,10 @@
 
     @Override
     public Processor<K, V> get() {
-        return new KStreamPassThroughProcessor<K, V>();
+        return new KStreamPassThroughProcessor<>();
     }
 
-    public class KStreamPassThroughProcessor<K, V> extends AbstractProcessor<K, V> {
+    private static final class KStreamPassThroughProcessor<K, V> extends AbstractProcessor<K, V> {
         @Override
         public void process(K key, V value) {
             context().forward(key, value);
