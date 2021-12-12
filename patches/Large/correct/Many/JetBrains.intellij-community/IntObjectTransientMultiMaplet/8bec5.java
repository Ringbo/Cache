diff --git a/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectTransientMultiMaplet.java b/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectTransientMultiMaplet.java
index 830bdae..e5d91e4 100644
--- a/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectTransientMultiMaplet.java
+++ b/jps/model/src/org/jetbrains/ether/dependencyView/IntObjectTransientMultiMaplet.java
@@ -55,7 +55,7 @@
 
   @Override
   public void replace(int key, Collection<V> value) {
-    if (value == null) {
+    if (value == null || value.size() == 0) {
       myMap.remove(key);
     }
     else {
