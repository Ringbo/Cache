diff --git a/src/customui/java/components/VirtualFlow.java b/src/customui/java/components/VirtualFlow.java
index adf8df8..fe4ac25 100644
--- a/src/customui/java/components/VirtualFlow.java
+++ b/src/customui/java/components/VirtualFlow.java
@@ -2328,7 +2328,7 @@
             // sure that we DO NOT add empty trailing cells (since we are
             // in the full virtual case and so there are no trailing empty
             // cells).
-            if (! addTrailingCells(false)) {
+            if (! addTrailingCells(true)) {
                 // Reached the end, but not enough cells to fill up to
                 // the end. So, remove the trailing empty space, and translate
                 // the cells down
