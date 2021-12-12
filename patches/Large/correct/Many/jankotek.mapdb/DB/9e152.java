diff --git a/src/main/java/org/mapdb/DB.java b/src/main/java/org/mapdb/DB.java
index 46be637..36bf00f 100644
--- a/src/main/java/org/mapdb/DB.java
+++ b/src/main/java/org/mapdb/DB.java
@@ -55,8 +55,7 @@
     protected Map<String, WeakReference<?>> namesInstanciated = new HashMap<String, WeakReference<?>>();
 
     protected Map<IdentityWrapper, String> namesLookup =
-            Collections.synchronizedMap( //TODO remove synchronized map, after DB locking is resolved
-            new HashMap<IdentityWrapper, String>());
+            new ConcurrentHashMap<IdentityWrapper, String>();
 
     /** view over named records */
     protected SortedMap<String, Object> catalog;
@@ -73,6 +72,7 @@
     //TODO collection get/create should be under consistencyLock.readLock()
     protected final ReadWriteLock consistencyLock;
 
+    /** changes object hash and equals method to use identity */
     protected static class IdentityWrapper{
 
         final Object o;
@@ -228,7 +228,7 @@
     }
 
     /** returns name for this object, if it has name and was instanciated by this DB*/
-    public synchronized  String getNameForObject(Object obj) {
+    public String getNameForObject(Object obj) {
         return namesLookup.get(new IdentityWrapper(obj));
     }
 
