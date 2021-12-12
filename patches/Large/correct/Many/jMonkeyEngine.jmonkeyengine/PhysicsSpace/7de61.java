diff --git a/jme3-bullet/src/main/java/com/jme3/bullet/PhysicsSpace.java b/jme3-bullet/src/main/java/com/jme3/bullet/PhysicsSpace.java
index f3575bc..debd369 100644
--- a/jme3-bullet/src/main/java/com/jme3/bullet/PhysicsSpace.java
+++ b/jme3-bullet/src/main/java/com/jme3/bullet/PhysicsSpace.java
@@ -995,7 +995,7 @@
         return solverNumIterations;
     }
     
-    private static native void setSolverNumIterations(long physicsSpaceId, int numIterations);
+    private native void setSolverNumIterations(long physicsSpaceId, int numIterations);
     
     public static native void initNativePhysics();
 
