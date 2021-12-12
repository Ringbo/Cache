diff --git a/core/java/com/android/internal/widget/AutoScrollHelper.java b/core/java/com/android/internal/widget/AutoScrollHelper.java
index f728e6a..6298e35 100644
--- a/core/java/com/android/internal/widget/AutoScrollHelper.java
+++ b/core/java/com/android/internal/widget/AutoScrollHelper.java
@@ -531,7 +531,7 @@
             case EDGE_TYPE_INSIDE:
             case EDGE_TYPE_INSIDE_EXTEND:
                 if (current < leading) {
-                    if (current > 0) {
+                    if (current >= 0) {
                         // Movement up to the edge is scaled.
                         return 1f - current / leading;
                     } else if (mActive && (mEdgeType == EDGE_TYPE_INSIDE_EXTEND)) {
