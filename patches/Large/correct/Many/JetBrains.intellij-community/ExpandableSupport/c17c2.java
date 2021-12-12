diff --git a/platform/platform-api/src/com/intellij/ui/components/fields/ExpandableSupport.java b/platform/platform-api/src/com/intellij/ui/components/fields/ExpandableSupport.java
index f726b44..5e4aca5 100644
--- a/platform/platform-api/src/com/intellij/ui/components/fields/ExpandableSupport.java
+++ b/platform/platform-api/src/com/intellij/ui/components/fields/ExpandableSupport.java
@@ -110,7 +110,7 @@
     UIUtil.addUndoRedoActions(area);
 
     JBScrollPane pane = new JBScrollPane(area);
-    addExtension(pane, createCollapseExtension(this));
+    addExtension(pane, createCollapseExtension());
 
     Insets insets = getInsets(source);
     //TODO: support scroll pane
@@ -177,18 +177,18 @@
     }
   }
 
-  public static Extension createCollapseExtension(@NotNull Expandable expandable) {
+  public Extension createCollapseExtension() {
     return Extension.create(AllIcons.General.CollapseComponent,
                             AllIcons.General.CollapseComponentHover,
                             createTooltipText("Collapse", "CollapseExpandableComponent"),
-                            expandable::collapse);
+                            this::collapse);
   }
 
-  public static Extension createExpandExtension(@NotNull Expandable expandable) {
+  public Extension createExpandExtension() {
     return Extension.create(AllIcons.General.ExpandComponent,
                             AllIcons.General.ExpandComponentHover,
                             createTooltipText("Expand", "ExpandExpandableComponent"),
-                            expandable::collapse);
+                            this::expand);
   }
 
   private static void addExtension(@NotNull JScrollPane pane, @NotNull Extension extension) {
