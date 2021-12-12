diff --git a/Essentials/src/com/earth2me/essentials/Teleport.java b/Essentials/src/com/earth2me/essentials/Teleport.java
index f04a2d8..37efb9a 100644
--- a/Essentials/src/com/earth2me/essentials/Teleport.java
+++ b/Essentials/src/com/earth2me/essentials/Teleport.java
@@ -174,12 +174,12 @@
 
 	public void teleport(Location loc, String name) throws Exception
 	{
-		teleport(new Target(loc), chargeFor);
+		teleport(new Target(loc), name);
 	}
 
 	public void teleport(Entity entity, String name) throws Exception
 	{
-		teleport(new Target(entity), chargeFor);
+		teleport(new Target(entity), name);
 	}
 
 	private void teleport(Target target, String chargeFor) throws Exception
