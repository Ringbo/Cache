diff --git a/fml/common/cpw/mods/fml/common/FMLLog.java b/fml/common/cpw/mods/fml/common/FMLLog.java
index 2ece0d8..d703b6b 100644
--- a/fml/common/cpw/mods/fml/common/FMLLog.java
+++ b/fml/common/cpw/mods/fml/common/FMLLog.java
@@ -14,7 +14,7 @@
 
     public static void log(Level level, Throwable ex, String format, Object... data)
     {
-        coreLog.log(level, String.format(format, data), ex);
+        coreLog.log(level, ex, String.format(format, data));
     }
 
     public static void severe(String format, Object... data)
