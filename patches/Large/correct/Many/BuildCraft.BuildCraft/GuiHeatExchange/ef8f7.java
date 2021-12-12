diff --git a/common/buildcraft/factory/gui/GuiHeatExchange.java b/common/buildcraft/factory/gui/GuiHeatExchange.java
index e215c69..264edd7 100644
--- a/common/buildcraft/factory/gui/GuiHeatExchange.java
+++ b/common/buildcraft/factory/gui/GuiHeatExchange.java
@@ -31,7 +31,7 @@
         boolean crafted = heatExchange.hasCraftedRecently();
         if (crafted) craftTicks = 20;
         if ((heatExchange.getInputCoolable() != null && heatExchange.getInputCoolable().amount > 0) || crafted) inCoolableTicks = 20;
-        if ((heatExchange.getInputHeatable() != null && heatExchange.getInputHeatable().amount > 0) || crafted) inCoolableTicks = 20;
+        if ((heatExchange.getInputHeatable() != null && heatExchange.getInputHeatable().amount > 0) || crafted) inHeatableTicks = 20;
 
         if ((heatExchange.getOutputCooled() != null && heatExchange.getOutputCooled().amount > 0) || crafted) outCooledTicks = 20;
         if ((heatExchange.getOutputHeated() != null && heatExchange.getOutputHeated().amount > 0) || crafted) outHeatedTicks = 20;
