diff --git a/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/Status.java b/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/Status.java
index b7253b3..a3d8d5b 100644
--- a/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/Status.java
+++ b/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/Status.java
@@ -45,7 +45,7 @@
             int instances = profile.getCount();
 
             Integer minimum = profile.getMinimumInstances();
-            Integer maximum = profile.getMinimumInstances();
+            Integer maximum = profile.getMaximumInstances();
             double health = profile.getHealth(instances);
 
             out.println(String.format("%-40s %-14s %s", id, instances, percentText(health)));
