diff --git a/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/factory/DefaultDataBufferFactory.java b/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/factory/DefaultDataBufferFactory.java
index a20a308..4742915 100644
--- a/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/factory/DefaultDataBufferFactory.java
+++ b/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/factory/DefaultDataBufferFactory.java
@@ -289,7 +289,7 @@
             case FLOAT:
                 return createFloat(buffer.length(), init);
             case DOUBLE:
-                return createHalf(buffer.length(), init);
+                return createDouble(buffer.length(), init);
             case HALF:
                 return createHalf(buffer.length(), init);
             default:
@@ -312,7 +312,7 @@
             case FLOAT:
                 return createFloat(buffer.length(), init, workspace);
             case DOUBLE:
-                return createHalf(buffer.length(), init, workspace);
+                return createDouble(buffer.length(), init, workspace);
             case HALF:
                 return createHalf(buffer.length(), init, workspace);
             default:
