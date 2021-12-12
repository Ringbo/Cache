diff --git a/src/main/java/net/minecraftforge/fml/common/FMLModContainer.java b/src/main/java/net/minecraftforge/fml/common/FMLModContainer.java
index c38db80..b1fe94e 100644
--- a/src/main/java/net/minecraftforge/fml/common/FMLModContainer.java
+++ b/src/main/java/net/minecraftforge/fml/common/FMLModContainer.java
@@ -225,7 +225,7 @@
 
         String mcVersionString = (String)descriptor.get("acceptedMinecraftVersions");
         if ("[1.8.8]".equals(mcVersionString)) mcVersionString = "[1.8.8,1.8.9]"; // MC 1.8.8 and 1.8.9 is forward SRG compatible so accept these versions by default.
-        if ("[1.9.4]".equals(mcVersionString) || "[1.9,1.9.4]".equals(mcVersionString)) mcVersionString = "[1.9.4,1.10]"; // MC 1.8.8 and 1.8.9 is forward SRG compatible so accept these versions by default.
+        if ("[1.9.4]".equals(mcVersionString) || "[1.9,1.9.4]".equals(mcVersionString) || "[1.9.4,1.10)".equals(mcVersionString)) mcVersionString = "[1.9.4,1.10]"; // MC 1.8.8 and 1.8.9 is forward SRG compatible so accept these versions by default.
         if (!Strings.isNullOrEmpty(mcVersionString))
         {
             minecraftAccepted = VersionParser.parseRange(mcVersionString);
