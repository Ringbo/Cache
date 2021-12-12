diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GMConfiguration.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GMConfiguration.java
index 95fd35e..4fcd0a5 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GMConfiguration.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GMConfiguration.java
@@ -112,7 +112,7 @@
 
 			Object level = ((Map<String, String>) getElement("settings", GMconfig).get("logging")).get("level");
 			if (level instanceof String)
-				level = (String) level;
+				loggerLevel = (String) level;
 
 			/*
 			 * Store our mirrors map for parsing later.
