diff --git a/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/commands/fab/StartCommand.java b/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/commands/fab/StartCommand.java
index 86ff96c..bbdc9c4 100644
--- a/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/commands/fab/StartCommand.java
+++ b/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/commands/fab/StartCommand.java
@@ -39,7 +39,7 @@
 
         // TODO need to wait for all dependent bundles to be started ideally!
         try {
-            Thread.sleep(100L);
+            Thread.sleep(1000L);
         } catch (InterruptedException e) {
             // ignore
         }
