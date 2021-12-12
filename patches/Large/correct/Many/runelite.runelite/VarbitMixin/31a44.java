diff --git a/runelite-mixins/src/main/java/net/runelite/mixins/VarbitMixin.java b/runelite-mixins/src/main/java/net/runelite/mixins/VarbitMixin.java
index 7df5e3d..c0f8812 100644
--- a/runelite-mixins/src/main/java/net/runelite/mixins/VarbitMixin.java
+++ b/runelite-mixins/src/main/java/net/runelite/mixins/VarbitMixin.java
@@ -64,7 +64,7 @@
 			varbitCache.put(varbitId, v);
 		}
 
-		int[] settings = getWidgetSettings();
+		int[] settings = getSettings();
 		int value = settings[v.getIndex()];
 		int lsb = v.getLeastSignificantBit();
 		int msb = v.getMostSignificantBit();
