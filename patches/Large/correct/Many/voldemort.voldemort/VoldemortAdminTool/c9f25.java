diff --git a/src/java/voldemort/VoldemortAdminTool.java b/src/java/voldemort/VoldemortAdminTool.java
index 86af002..f6df758 100644
--- a/src/java/voldemort/VoldemortAdminTool.java
+++ b/src/java/voldemort/VoldemortAdminTool.java
@@ -711,7 +711,7 @@
                 dos.write(keyBytes);
                 dos.writeInt(versionBytes.length);
                 dos.write(versionBytes);
-                dos.write(valueBytes.length);
+                dos.writeInt(valueBytes.length);
                 dos.write(valueBytes);
             }
         } finally {
