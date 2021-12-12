diff --git a/src/org/terasology/logic/tools/RailgunTool.java b/src/org/terasology/logic/tools/RailgunTool.java
index 67c5bbb..62044fe 100644
--- a/src/org/terasology/logic/tools/RailgunTool.java
+++ b/src/org/terasology/logic/tools/RailgunTool.java
@@ -50,7 +50,7 @@
         //Vector3d origin = blockPos.toVector3d();
         Vector3d dir = _player.getViewingDirection();
         Vector3d origin = (Vector3d)_player.getPosition().clone();
-        for(int s = 4; s <= 2000; s+=30){
+        for(int s = 4; s <= 10000; s+=30){
 
             origin.add(dir);
 
