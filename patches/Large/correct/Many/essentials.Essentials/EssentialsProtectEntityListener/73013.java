diff --git a/EssentialsProtect/src/com/earth2me/essentials/protect/EssentialsProtectEntityListener.java b/EssentialsProtect/src/com/earth2me/essentials/protect/EssentialsProtectEntityListener.java
index bb406eb..30a5166 100644
--- a/EssentialsProtect/src/com/earth2me/essentials/protect/EssentialsProtectEntityListener.java
+++ b/EssentialsProtect/src/com/earth2me/essentials/protect/EssentialsProtectEntityListener.java
@@ -224,7 +224,7 @@
 			}
 			return;
 		}
-		if (event.getEntity() instanceof WitherSkull
+		if (event.getEntity() instanceof Wither
 			&& prot.getSettingBool(ProtectConfig.prevent_witherskull_spawnexplosion))
 		{
 			event.setCancelled(true);
