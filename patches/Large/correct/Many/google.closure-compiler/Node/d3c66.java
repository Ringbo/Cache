diff --git a/src/com/google/javascript/rhino/Node.java b/src/com/google/javascript/rhino/Node.java
index 5f2d9ea..8db9b13 100644
--- a/src/com/google/javascript/rhino/Node.java
+++ b/src/com/google/javascript/rhino/Node.java
@@ -2456,7 +2456,7 @@
   /**
    * returns true if all the flags are set in value.
    */
-  private boolean areBitFlagsSet(int value, int flags) {
+  private static boolean areBitFlagsSet(int value, int flags) {
     return (value & flags) == flags;
   }
 
