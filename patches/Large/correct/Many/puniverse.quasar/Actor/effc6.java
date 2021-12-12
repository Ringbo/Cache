diff --git a/src/main/java/co/paralleluniverse/actors/Actor.java b/src/main/java/co/paralleluniverse/actors/Actor.java
index 1261d41..5086f08 100644
--- a/src/main/java/co/paralleluniverse/actors/Actor.java
+++ b/src/main/java/co/paralleluniverse/actors/Actor.java
@@ -227,7 +227,7 @@
 
     @Override
     public boolean isDone() {
-        return strand.isAlive();
+        return !strand.isAlive();
     }
     //</editor-fold>
 
