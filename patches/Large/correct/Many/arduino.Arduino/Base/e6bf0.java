diff --git a/app/src/processing/app/Base.java b/app/src/processing/app/Base.java
index 3cfa4c5..be15eef 100644
--- a/app/src/processing/app/Base.java
+++ b/app/src/processing/app/Base.java
@@ -1432,7 +1432,7 @@
     boardMenu.add(new JSeparator());
 
     // Generate custom menus for all platforms
-    Set<String> customMenusTitles = new HashSet<>();
+    Set<String> customMenusTitles = new LinkedHashSet<>();
     for (TargetPackage targetPackage : BaseNoGui.packages.values()) {
       for (TargetPlatform targetPlatform : targetPackage.platforms()) {
         customMenusTitles.addAll(targetPlatform.getCustomMenus().values());
