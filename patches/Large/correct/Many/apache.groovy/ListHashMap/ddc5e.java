diff --git a/src/main/org/codehaus/groovy/util/ListHashMap.java b/src/main/org/codehaus/groovy/util/ListHashMap.java
index 13c6cd2..3241084 100644
--- a/src/main/org/codehaus/groovy/util/ListHashMap.java
+++ b/src/main/org/codehaus/groovy/util/ListHashMap.java
@@ -76,7 +76,7 @@
 
     private Map<K,V> makeMap() {
         Map<K,V> m = new HashMap();
-        for (int i=0; i<maxListFill; i++) {
+        for (int i=0; i<size; i++) {
             m.put((K) listKeys[i], (V) listValues[i]);
         }
         return m;
@@ -84,7 +84,7 @@
     
     public Set<java.util.Map.Entry<K, V>> entrySet() {
         Map m;
-        if (size<maxListFill) {
+        if (size>maxListFill) {
             m = innerMap;
         } else {
             m = makeMap();
