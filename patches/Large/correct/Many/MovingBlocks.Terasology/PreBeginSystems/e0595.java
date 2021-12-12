diff --git a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PreBeginSystems.java b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PreBeginSystems.java
index a4e5650..943e98c 100644
--- a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PreBeginSystems.java
+++ b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PreBeginSystems.java
@@ -38,7 +38,7 @@
         if (componentSystems.hasNext()) {
             componentSystems.next().preBegin();
         }
-        return componentSystems.hasNext();
+        return !componentSystems.hasNext();
     }
 
     @Override
