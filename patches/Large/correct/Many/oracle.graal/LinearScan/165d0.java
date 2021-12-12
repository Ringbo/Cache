diff --git a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/LinearScan.java b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/LinearScan.java
index 083cce4..5d091b4 100644
--- a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/LinearScan.java
+++ b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/LinearScan.java
@@ -2082,7 +2082,7 @@
             int nextBlockIndex = block.getLinearScanNumber() + 1;
             if (nextBlockIndex < sortedBlocks.size()) {
                 block = sortedBlocks.get(nextBlockIndex);
-                if (range.to < getFirstLirInstructionId(block)) {
+                if (range.to <= getFirstLirInstructionId(block)) {
                     range = range.next;
                     if (range == Range.EndMarker) {
                         block = null;
