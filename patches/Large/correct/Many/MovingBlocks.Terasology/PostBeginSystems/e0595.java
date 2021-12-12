diff --git a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PostBeginSystems.java b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PostBeginSystems.java
index 3951e77..ed0157d 100644
--- a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PostBeginSystems.java
+++ b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/PostBeginSystems.java
@@ -38,7 +38,7 @@
         if (componentSystems.hasNext()) {
             componentSystems.next().postBegin();
         }
-        return componentSystems.hasNext();
+        return !componentSystems.hasNext();
     }
 
     @Override
