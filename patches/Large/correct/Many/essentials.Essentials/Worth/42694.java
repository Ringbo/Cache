diff --git a/Essentials/src/com/earth2me/essentials/Worth.java b/Essentials/src/com/earth2me/essentials/Worth.java
index 8cc65e2..ac5dbfe 100644
--- a/Essentials/src/com/earth2me/essentials/Worth.java
+++ b/Essentials/src/com/earth2me/essentials/Worth.java
@@ -24,19 +24,19 @@
 		String itemname = itemStack.getType().toString().toLowerCase(Locale.ENGLISH).replace("_", "");
 		BigDecimal result;
 		result = config.getBigDecimal("worth." + itemname + "." + itemStack.getDurability(), BigDecimal.ONE.negate());
-		if (result.signum() <= 0)
+		if (result.signum() < 0)
 		{
 			result = config.getBigDecimal("worth." + itemname + ".0", BigDecimal.ONE.negate());
 		}
-		if (result.signum() <= 0)
+		if (result.signum() < 0)
 		{
 			result = config.getBigDecimal("worth." + itemname, BigDecimal.ONE.negate());
 		}
-		if (result.signum() <= 0)
+		if (result.signum() < 0)
 		{
 			result = config.getBigDecimal("worth-" + itemStack.getTypeId(), BigDecimal.ONE.negate());
 		}
-		if (result.signum() <= 0)
+		if (result.signum() < 0)
 		{
 			return null;
 		}
