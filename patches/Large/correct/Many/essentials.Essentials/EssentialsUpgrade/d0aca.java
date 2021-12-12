diff --git a/Essentials/src/com/earth2me/essentials/EssentialsUpgrade.java b/Essentials/src/com/earth2me/essentials/EssentialsUpgrade.java
index 26e6f25..f70f0c0 100644
--- a/Essentials/src/com/earth2me/essentials/EssentialsUpgrade.java
+++ b/Essentials/src/com/earth2me/essentials/EssentialsUpgrade.java
@@ -271,18 +271,18 @@
 				if (config.hasProperty("powertools"))
 				{
 					@SuppressWarnings("unchecked")
-					final Map<Integer, Object> powertools = (Map<Integer, Object>)config.getProperty("powertools");
+					final Map<String, Object> powertools = config.getConfigurationSection("powertools").getValues(false);
 					if (powertools == null)
 					{
 						continue;
 					}
-					for (Map.Entry<Integer, Object> entry : powertools.entrySet())
+					for (Map.Entry<String, Object> entry : powertools.entrySet())
 					{
 						if (entry.getValue() instanceof String)
 						{
 							List<String> temp = new ArrayList<String>();
 							temp.add((String)entry.getValue());
-							((Map<Integer, Object>)powertools).put(entry.getKey(), temp);
+							((Map<String, Object>)powertools).put(entry.getKey(), temp);
 						}
 					}
 					config.save();
