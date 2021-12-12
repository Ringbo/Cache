diff --git a/src/main/java/org/mapdb/tree/IndexTreeListJava.java b/src/main/java/org/mapdb/tree/IndexTreeListJava.java
index 54a3356..6e2c223 100644
--- a/src/main/java/org/mapdb/tree/IndexTreeListJava.java
+++ b/src/main/java/org/mapdb/tree/IndexTreeListJava.java
@@ -348,7 +348,7 @@
 
             if (oldIndex == -1) {
                 if (oldVal == 0) {
-                    throw new AssertionError(); //empty pos, but that should be already covered by dirPos<0
+                    throw new IllegalStateException(); //empty pos, but that should be already covered by dirPos<0
                 } else {
                     //dive deeper
                     recid = oldVal;
@@ -432,7 +432,7 @@
 
         if (oldIndex == -1) {
             if (oldVal == 0) {
-                throw new AssertionError(); //this was already covered by negative pos
+                throw new IllegalStateException(); //this was already covered by negative pos
             } else {
                 //dive deeper
                 return treeRemove(dirShift, oldVal, store, level-1, index, expectedValue);
@@ -487,7 +487,7 @@
 
         if (oldIndex == -1) {
             if (oldVal == 0) {
-                throw new AssertionError(); //this was already covered by negative pos
+                throw new IllegalStateException(); //this was already covered by negative pos
             } else {
                 //dive deeper
                 long[] result =  treeRemoveCollapsing(dirShift, oldVal, store, level-1, false, index, expectedValue);
