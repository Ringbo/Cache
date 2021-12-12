diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandeco.java b/Essentials/src/com/earth2me/essentials/commands/Commandeco.java
index 618583c..aa726ee 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandeco.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandeco.java
@@ -58,7 +58,7 @@
 			User u = ess.getUser(args[1]);
 			if (u == null)
 			{
-				u = ess.getOfflineUser(args[0]);
+				u = ess.getOfflineUser(args[1]);
 			}
 			switch (cmd)
 			{
