diff --git a/services/net/java/android/net/apf/ApfGenerator.java b/services/net/java/android/net/apf/ApfGenerator.java
index d41fbce..ca8f727 100644
--- a/services/net/java/android/net/apf/ApfGenerator.java
+++ b/services/net/java/android/net/apf/ApfGenerator.java
@@ -367,7 +367,7 @@
      */
     public boolean setApfVersion(int version) {
         // This version number syncs up with APF_VERSION in hardware/google/apf/apf_interpreter.h
-        return version == 2;
+        return version >= 2;
     }
 
     private void addInstruction(Instruction instruction) {
