diff --git a/jre_emul/android/libcore/luni/src/main/java/java/util/concurrent/ConcurrentHashMap.java b/jre_emul/android/libcore/luni/src/main/java/java/util/concurrent/ConcurrentHashMap.java
index 5df2fc3..b274c17 100644
--- a/jre_emul/android/libcore/luni/src/main/java/java/util/concurrent/ConcurrentHashMap.java
+++ b/jre_emul/android/libcore/luni/src/main/java/java/util/concurrent/ConcurrentHashMap.java
@@ -648,6 +648,10 @@
     private transient volatile CounterCell[] counterCells;
 
     // views
+    // J2ObjC -- Added @RetainedWith annotations to resolve cycles between these views and the
+    // containing map. The accessors must be synchronized because with @RetainedWith we can no
+    // longer allow the race condition where the view field is assigned twice if the same accessor
+    // is called concurrently by multiple threads.
     @RetainedWith private transient KeySetView<K,V> keySet;
     @RetainedWith private transient ValuesView<K,V> values;
     @RetainedWith private transient EntrySetView<K,V> entrySet;
@@ -1065,7 +1069,7 @@
      * @return the set view
      */
     // android-note : changed KeySetView<K,V> to Set<K> to maintain API compatibility.
-    public Set<K> keySet() {
+    public synchronized Set<K> keySet() {
         KeySetView<K,V> ks;
         return (ks = keySet) != null ? ks : (keySet = new KeySetView<K,V>(this, null));
     }
@@ -1088,7 +1092,7 @@
      *
      * @return the collection view
      */
-    public Collection<V> values() {
+    public synchronized Collection<V> values() {
         ValuesView<K,V> vs;
         return (vs = values) != null ? vs : (values = new ValuesView<K,V>(this));
     }
@@ -1110,7 +1114,7 @@
      *
      * @return the set view
      */
-    public Set<Map.Entry<K,V>> entrySet() {
+    public synchronized Set<Map.Entry<K,V>> entrySet() {
         EntrySetView<K,V> es;
         return (es = entrySet) != null ? es : (entrySet = new EntrySetView<K,V>(this));
     }
