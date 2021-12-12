diff --git a/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectPersistentMultiMaplet.java b/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectPersistentMultiMaplet.java
index d2978f4..100b125 100644
--- a/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectPersistentMultiMaplet.java
+++ b/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectPersistentMultiMaplet.java
@@ -83,7 +83,7 @@
   public void replace(int key, Collection<V> value) {
     try {
       myCache.remove(key);
-      if (value == null) {
+      if (value == null || value.size() == 0) {
         myMap.remove(key);
       }
       else {
