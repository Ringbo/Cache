diff --git a/fml/common/cpw/mods/fml/common/FMLLogFormatter.java b/fml/common/cpw/mods/fml/common/FMLLogFormatter.java
index e1bcb20..d8576d3 100644
--- a/fml/common/cpw/mods/fml/common/FMLLogFormatter.java
+++ b/fml/common/cpw/mods/fml/common/FMLLogFormatter.java
@@ -51,7 +51,7 @@
         }
 
         msg.append(record.getMessage());
-        msg.append(System.lineSeparator());
+        msg.append(System.getProperty("line.separator"));
         Throwable thr = record.getThrown();
 
         if (thr != null)
