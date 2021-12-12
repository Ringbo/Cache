diff --git a/jme3-networking/src/main/java/com/jme3/network/serializing/serializers/SavableSerializer.java b/jme3-networking/src/main/java/com/jme3/network/serializing/serializers/SavableSerializer.java
index 47be441..c91c8e4 100644
--- a/jme3-networking/src/main/java/com/jme3/network/serializing/serializers/SavableSerializer.java
+++ b/jme3-networking/src/main/java/com/jme3/network/serializing/serializers/SavableSerializer.java
@@ -93,7 +93,7 @@
         @Override
         public int read(byte[] b, int off, int len){
             int toRead = len > input.remaining() ? input.remaining() : len;
-            input.get(b, off, len);
+            input.get(b, off, toRead);
             return toRead;
         }
 
