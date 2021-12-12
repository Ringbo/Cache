diff --git a/Essentials/src/com/earth2me/essentials/EssentialsEntityListener.java b/Essentials/src/com/earth2me/essentials/EssentialsEntityListener.java
index 7ef9f97..d8379dd 100644
--- a/Essentials/src/com/earth2me/essentials/EssentialsEntityListener.java
+++ b/Essentials/src/com/earth2me/essentials/EssentialsEntityListener.java
@@ -56,7 +56,8 @@
 		}
 		else if (eAttack instanceof Projectile && eDefend instanceof Player)
 		{
-			Entity shooter = ((Projectile)event.getDamager()).getShooter();
+			//This should return a ProjectileSource on 1.7.3 beta +
+			Object shooter = ((Projectile)event.getDamager()).getShooter();
 			if (shooter instanceof Player)
 			{
 				final User attacker = ess.getUser((Player)shooter);
