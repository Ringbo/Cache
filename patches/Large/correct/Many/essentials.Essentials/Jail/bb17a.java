diff --git a/Essentials/src/com/earth2me/essentials/Jail.java b/Essentials/src/com/earth2me/essentials/Jail.java
index fdc1840..ff3bec2 100644
--- a/Essentials/src/com/earth2me/essentials/Jail.java
+++ b/Essentials/src/com/earth2me/essentials/Jail.java
@@ -31,7 +31,7 @@
 
 	public Location getJail(String jailName) throws Exception
 	{
-		if (config.getProperty(jailName.toLowerCase()) == null)
+		if (jailName == null || config.getProperty(jailName.toLowerCase()) == null)
 		{
 			throw new Exception(Util.i18n("jailNotExist"));
 		}
