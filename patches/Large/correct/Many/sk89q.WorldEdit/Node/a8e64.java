diff --git a/src/main/java/com/sk89q/worldedit/expression/runtime/Node.java b/src/main/java/com/sk89q/worldedit/expression/runtime/Node.java
index 4d38a12..a4d5ce1 100644
--- a/src/main/java/com/sk89q/worldedit/expression/runtime/Node.java
+++ b/src/main/java/com/sk89q/worldedit/expression/runtime/Node.java
@@ -39,7 +39,7 @@
     }
 
     @Override
-    public int getPosition() {
+    public final int getPosition() {
         return position;
     }
 }
