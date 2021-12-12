diff --git a/math/src/main/java/org/apache/mahout/math/map/OpenHashMap.java b/math/src/main/java/org/apache/mahout/math/map/OpenHashMap.java
index 4351032..57f453c 100644
--- a/math/src/main/java/org/apache/mahout/math/map/OpenHashMap.java
+++ b/math/src/main/java/org/apache/mahout/math/map/OpenHashMap.java
@@ -97,7 +97,7 @@
   /** Removes all (key,value) associations from the receiver. Implicitly calls <tt>trimToSize()</tt>. */
   @Override
   public void clear() {
-    Arrays.fill(this.state, 0, state.length - 1, FREE);
+    Arrays.fill(this.state, FREE);
     distinct = 0;
     freeEntries = table.length; // delta
     trimToSize();
