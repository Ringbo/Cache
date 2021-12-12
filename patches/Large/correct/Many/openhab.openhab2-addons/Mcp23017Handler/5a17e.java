diff --git a/addons/binding/org.openhab.binding.mcp23017/src/main/java/org/openhab/binding/mcp23017/handler/Mcp23017Handler.java b/addons/binding/org.openhab.binding.mcp23017/src/main/java/org/openhab/binding/mcp23017/handler/Mcp23017Handler.java
index d4a3aac..eb107dd 100644
--- a/addons/binding/org.openhab.binding.mcp23017/src/main/java/org/openhab/binding/mcp23017/handler/Mcp23017Handler.java
+++ b/addons/binding/org.openhab.binding.mcp23017/src/main/java/org/openhab/binding/mcp23017/handler/Mcp23017Handler.java
@@ -158,7 +158,7 @@
         Pin pin = PinMapper.get(channel.getIdWithoutGroup());
 
         String pullMode = DEFAULT_PULL_MODE;
-        if (thing.getChannel(channel.getIdWithoutGroup()) != null) {
+        if (thing.getChannel(channel.getId ()) != null) {
             Configuration configuration = thing.getChannel(channel.getId()).getConfiguration();
             pullMode = ((String) configuration.get(PULL_MODE)) != null ? ((String) configuration.get(PULL_MODE))
                     : DEFAULT_PULL_MODE;
