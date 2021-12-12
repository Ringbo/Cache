diff --git a/jps/jps-builders/src/org/jetbrains/jps/server/ServerState.java b/jps/jps-builders/src/org/jetbrains/jps/server/ServerState.java
index 0dd441fd..4021037 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/server/ServerState.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/server/ServerState.java
@@ -313,7 +313,7 @@
           lib.setClasspath(library.getPaths());
         }
         else {
-          LOG.info("Failed to load global library " + lib.getName());
+          LOG.info("Failed to load global library " + library.getName());
         }
       }
     }
