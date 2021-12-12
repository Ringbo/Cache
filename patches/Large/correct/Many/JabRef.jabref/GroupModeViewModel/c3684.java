diff --git a/src/main/java/org/jabref/gui/groups/GroupModeViewModel.java b/src/main/java/org/jabref/gui/groups/GroupModeViewModel.java
index d88565f..022941a 100644
--- a/src/main/java/org/jabref/gui/groups/GroupModeViewModel.java
+++ b/src/main/java/org/jabref/gui/groups/GroupModeViewModel.java
@@ -8,7 +8,7 @@
 
 public class GroupModeViewModel {
 
-    private GroupViewMode mode;
+    private final GroupViewMode mode;
 
     public GroupModeViewModel(GroupViewMode mode) {
         this.mode = mode;
@@ -27,9 +27,9 @@
 
     public Tooltip getUnionIntersectionTooltip() {
         if (mode == GroupViewMode.UNION) {
-            return new Tooltip(Localization.lang("Toogle intersection"));
+            return new Tooltip(Localization.lang("Toggle intersection"));
         } else if (mode == GroupViewMode.INTERSECTION) {
-            return new Tooltip(Localization.lang("Toogle union"));
+            return new Tooltip(Localization.lang("Toggle union"));
         }
         return new Tooltip();
     }
