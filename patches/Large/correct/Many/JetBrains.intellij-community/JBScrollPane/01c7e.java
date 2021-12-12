diff --git a/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java b/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
index 0ab29a4..ce2cfa9 100644
--- a/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
+++ b/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
@@ -379,7 +379,7 @@
 
     // increases default unit increment for non-scrollable components to provide fast scrolling
     private int fixUnitIncrement(int increment) {
-      if (increment != 1) return increment;
+      if (increment != 1 || Registry.is("ide.scroll.default.unit.increment")) return increment;
 
       JViewport viewport = getViewport();
       if (viewport == null) return increment;
