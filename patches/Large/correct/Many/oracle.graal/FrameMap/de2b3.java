diff --git a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/FrameMap.java b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/FrameMap.java
index 50c5ed4..84c88e4 100644
--- a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/FrameMap.java
+++ b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/FrameMap.java
@@ -316,7 +316,7 @@
         spillSize += (slots * target.wordSize);
 
         if (!objects.isEmpty()) {
-            assert objects.length() < slots;
+            assert objects.length() <= slots;
             StackSlot result = null;
             for (int slotIndex = 0; slotIndex < slots; slotIndex++) {
                 StackSlot objectSlot = null;
