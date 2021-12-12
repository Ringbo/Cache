diff --git a/src/main/java/org/mapdb/DB.java b/src/main/java/org/mapdb/DB.java
index de709cb..82b9fec 100644
--- a/src/main/java/org/mapdb/DB.java
+++ b/src/main/java/org/mapdb/DB.java
@@ -154,7 +154,7 @@
     @NotNull
     synchronized public <K> Set<K> createHashSet(String name, Serializer<K> serializer){
         checkNameNotExists(name);
-        HTreeMap<K,Object> ret = new HTreeMap<K,Object>(engine, true, defaultSerializer, serializer, null);
+        HTreeMap<K,Object> ret = new HTreeMap<K,Object>(engine, false, defaultSerializer, serializer, null);
         nameDir.put(name, ret.rootRecid);
         Set<K> ret2 = ret.keySet();
         collections.put(name, new WeakReference<Object>(ret2));
@@ -269,7 +269,7 @@
     @NotNull
     synchronized public <K> NavigableSet<K> createTreeSet(String name, int nodeSize, Serializer<K[]> serializer, Comparator<K> comparator){
         checkNameNotExists(name);
-        BTreeMap<K,Object> ret = new BTreeMap<K,Object>(engine, nodeSize, true, false, defaultSerializer, serializer, null, comparator);
+        BTreeMap<K,Object> ret = new BTreeMap<K,Object>(engine, nodeSize, false, false, defaultSerializer, serializer, null, comparator);
         nameDir.put(name, ret.treeRecid);
         NavigableSet<K> ret2 = ret.keySet();
         collections.put(name, new WeakReference<Object>(ret2));
