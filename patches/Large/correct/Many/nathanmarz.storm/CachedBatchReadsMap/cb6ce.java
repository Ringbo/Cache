diff --git a/src/jvm/storm/trident/state/map/CachedBatchReadsMap.java b/src/jvm/storm/trident/state/map/CachedBatchReadsMap.java
index 62bd202..d6c3b21 100644
--- a/src/jvm/storm/trident/state/map/CachedBatchReadsMap.java
+++ b/src/jvm/storm/trident/state/map/CachedBatchReadsMap.java
@@ -7,11 +7,11 @@
 import storm.trident.state.ValueUpdater;
 
 public class CachedBatchReadsMap<T> implements MapState<T> {
-    Map<List<Object>, Object> _cached = new HashMap();
+    Map<List<Object>, T> _cached = new HashMap<List<Object>, T>();
     
-    public MapState _delegate;
+    public MapState<T> _delegate;
     
-    public CachedBatchReadsMap(MapState delegate) {
+    public CachedBatchReadsMap(MapState<T> delegate) {
         _delegate = delegate;
     }
     
@@ -23,7 +23,7 @@
             for(int i=0; i<keys.size(); i++) {
                 List<Object> key = keys.get(i);
                 if(_cached.containsKey(key)) {
-                    ret.set(i, (T) _cached.get(key));
+                    ret.set(i, _cached.get(key));
                 }
             }
         }
@@ -31,7 +31,7 @@
     }
 
     @Override
-    public List multiUpdate(List<List<Object>> keys, List<ValueUpdater> updaters) {
+    public List<T> multiUpdate(List<List<Object>> keys, List<ValueUpdater> updaters) {
         List<T> vals = _delegate.multiUpdate(keys, updaters);
         cache(keys, vals);
         return vals;
