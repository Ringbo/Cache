diff --git a/common/buildcraft/builders/gui/GuiFillingPlanner.java b/common/buildcraft/builders/gui/GuiFillingPlanner.java
index ee1c276..620184e 100644
--- a/common/buildcraft/builders/gui/GuiFillingPlanner.java
+++ b/common/buildcraft/builders/gui/GuiFillingPlanner.java
@@ -119,7 +119,7 @@
                 found.set(true);
             }
         });
-        container.addon.markDirty();
+        container.addon.updateBuildingInfo();
         if (!found.get()) {
             super.mouseClicked(mouseX, mouseY, mouseButton);
         }
