diff --git a/fml/common/cpw/mods/fml/relauncher/FMLRelaunchLog.java b/fml/common/cpw/mods/fml/relauncher/FMLRelaunchLog.java
index cd37858..4dabf3c 100644
--- a/fml/common/cpw/mods/fml/relauncher/FMLRelaunchLog.java
+++ b/fml/common/cpw/mods/fml/relauncher/FMLRelaunchLog.java
@@ -113,7 +113,7 @@
                 // Are we longer than just the line separator?
                 int lastIdx = -1;
                 int idx = currentMessage.indexOf("\n",lastIdx+1);
-                while (idx > 0)
+                while (idx >= 0)
                 {
                     log.log(Level.INFO, currentMessage.substring(lastIdx+1,idx));
                     lastIdx = idx;
