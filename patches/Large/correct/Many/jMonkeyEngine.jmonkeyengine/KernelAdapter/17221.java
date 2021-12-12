diff --git a/engine/src/networking/com/jme3/network/base/KernelAdapter.java b/engine/src/networking/com/jme3/network/base/KernelAdapter.java
index e5a3fd1..23275d3 100644
--- a/engine/src/networking/com/jme3/network/base/KernelAdapter.java
+++ b/engine/src/networking/com/jme3/network/base/KernelAdapter.java
@@ -178,7 +178,7 @@
         } else {
             // See if we already have one
             MessageProtocol result = messageBuffers.get(p);
-            if( result != null ) {
+            if( result == null ) {
                 result = new MessageProtocol();
                 messageBuffers.put(p, result);
             }
