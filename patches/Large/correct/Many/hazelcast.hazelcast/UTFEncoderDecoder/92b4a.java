diff --git a/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java b/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java
index 81d3255..4004adb 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java
@@ -274,7 +274,7 @@
 
         public FastStringCreator(Constructor<String> constructor) {
             this.constructor = constructor;
-            this.useOldStringConstructor = constructor.getTypeParameters().length == 3;
+            this.useOldStringConstructor = constructor.getParameterTypes().length == 3;
         }
 
         @Override
