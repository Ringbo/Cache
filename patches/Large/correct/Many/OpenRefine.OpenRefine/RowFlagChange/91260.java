diff --git a/main/src/com/google/refine/model/changes/RowFlagChange.java b/main/src/com/google/refine/model/changes/RowFlagChange.java
index 73855a8..76de149 100644
--- a/main/src/com/google/refine/model/changes/RowFlagChange.java
+++ b/main/src/com/google/refine/model/changes/RowFlagChange.java
@@ -93,7 +93,7 @@
             } else if ("oldFlagged".equals(field)) {
                 oldFlagged = Boolean.parseBoolean(value);
             } else if ("newFlagged".equals(field)) {
-                oldFlagged = Boolean.parseBoolean(value);
+                newFlagged = Boolean.parseBoolean(value);
             }
         }
         
