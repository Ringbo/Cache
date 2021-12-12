diff --git a/main/src/com/google/refine/model/changes/RowStarChange.java b/main/src/com/google/refine/model/changes/RowStarChange.java
index bde3822..563c02f 100644
--- a/main/src/com/google/refine/model/changes/RowStarChange.java
+++ b/main/src/com/google/refine/model/changes/RowStarChange.java
@@ -93,7 +93,7 @@
             } else if ("oldStarred".equals(field)) {
                 oldStarred = Boolean.parseBoolean(value);
             } else if ("newStarred".equals(field)) {
-                oldStarred = Boolean.parseBoolean(value);
+                newStarred = Boolean.parseBoolean(value);
             }
         }
         
