diff --git a/arduino-core/src/processing/app/helpers/CommandlineParser.java b/arduino-core/src/processing/app/helpers/CommandlineParser.java
index 069c037..a893701 100644
--- a/arduino-core/src/processing/app/helpers/CommandlineParser.java
+++ b/arduino-core/src/processing/app/helpers/CommandlineParser.java
@@ -244,7 +244,7 @@
     }
 
     TargetBoard targetBoard = targetPlatform.getBoard(split[2]);
-    if (targetBoard == null) {
+    if (targetBoard == null || !targetBoard.getId().equals(split[2])) {
       BaseNoGui.showError(null, I18n.format(_("{0}: Unknown board"), split[2]), 3);
     }
 
