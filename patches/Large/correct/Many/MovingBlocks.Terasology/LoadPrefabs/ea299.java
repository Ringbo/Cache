diff --git a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/LoadPrefabs.java b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/LoadPrefabs.java
index 1a8dae1..38c0e91 100644
--- a/engine/src/main/java/org/terasology/engine/modes/loadProcesses/LoadPrefabs.java
+++ b/engine/src/main/java/org/terasology/engine/modes/loadProcesses/LoadPrefabs.java
@@ -43,7 +43,7 @@
     public boolean step() {
         if (prefabs.hasNext()) {
             Assets.get(prefabs.next(), Prefab.class);
-            step();
+            stepDone();
         }
         return !prefabs.hasNext();
     }
