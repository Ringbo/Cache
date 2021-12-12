diff --git a/fml/common/cpw/mods/fml/common/Loader.java b/fml/common/cpw/mods/fml/common/Loader.java
index b0bacb7..2181eeb 100644
--- a/fml/common/cpw/mods/fml/common/Loader.java
+++ b/fml/common/cpw/mods/fml/common/Loader.java
@@ -831,7 +831,7 @@
             {
                 loaded.load(getClass().getClassLoader().getResourceAsStream("fmlbranding.properties"));
             }
-            catch (IOException e)
+            catch (Exception e)
             {
                 // File not found - ignore
             }
