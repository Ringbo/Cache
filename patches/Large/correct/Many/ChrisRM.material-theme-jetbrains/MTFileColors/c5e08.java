diff --git a/src/main/java/com/chrisrm/idea/schemes/MTFileColors.java b/src/main/java/com/chrisrm/idea/schemes/MTFileColors.java
index e1cf57f..cee0f3a 100644
--- a/src/main/java/com/chrisrm/idea/schemes/MTFileColors.java
+++ b/src/main/java/com/chrisrm/idea/schemes/MTFileColors.java
@@ -57,7 +57,7 @@
         final String property = FileColorsBundle.messageOrDefault("material.file." + allFileStatus.getId().toLowerCase(), "-1");
         // If not found do not add the color to the map
         if (Objects.equals(property, "-1")) {
-          FILE_STATUS_COLOR_MAP.put(allFileStatus, ColorKey.createColorKey("MT_" + allFileStatus.getId(), null));
+          FILE_STATUS_COLOR_MAP.put(allFileStatus, ColorKey.createColorKey("MT_" + allFileStatus.getId()));
           continue;
         }
 
