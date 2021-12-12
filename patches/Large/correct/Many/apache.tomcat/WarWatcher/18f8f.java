diff --git a/java/org/apache/catalina/ha/deploy/WarWatcher.java b/java/org/apache/catalina/ha/deploy/WarWatcher.java
index 3c63722..b74ffea 100644
--- a/java/org/apache/catalina/ha/deploy/WarWatcher.java
+++ b/java/org/apache/catalina/ha/deploy/WarWatcher.java
@@ -96,7 +96,7 @@
             } else if (check == -1) {
                 listener.fileRemoved(info.getWar());
                 //no need to keep in memory
-                currentStatus.remove(info.getWar().getAbsolutePath());
+                i.remove();
             }
         }
 
