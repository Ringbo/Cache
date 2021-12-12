diff --git a/engine/src/main/java/org/terasology/rendering/nui/layers/ingame/metrics/DebugOverlay.java b/engine/src/main/java/org/terasology/rendering/nui/layers/ingame/metrics/DebugOverlay.java
index d24e48b..d0de422 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/layers/ingame/metrics/DebugOverlay.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/layers/ingame/metrics/DebugOverlay.java
@@ -141,7 +141,8 @@
             });
         }
         UILabel saveStatusLabel = find("saveStatusLabel", UILabel.class);
-        if (saveStatusLabel != null) {
+        // clients do not have a storage manager
+        if (saveStatusLabel != null && storageManager != null) {
             saveStatusLabel.bindText(new ReadOnlyBinding<String>() {
                 @Override
                 public String get() {
