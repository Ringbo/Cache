diff --git a/common/buildcraft/core/fluids/Tank.java b/common/buildcraft/core/fluids/Tank.java
index bee7a45..f9709e6 100644
--- a/common/buildcraft/core/fluids/Tank.java
+++ b/common/buildcraft/core/fluids/Tank.java
@@ -72,7 +72,7 @@
 		toolTip.clear();
 		int amount = 0;
 		if (getFluid() != null && getFluid().amount > 0) {
-			ToolTipLine fluidName = new ToolTipLine(getFluid().getFluid().getLocalizedName());
+			ToolTipLine fluidName = new ToolTipLine(getFluid().getFluid().getLocalizedName(getFluid()));
 			fluidName.setSpacing(2);
 			toolTip.add(fluidName);
 			amount = getFluid().amount;
