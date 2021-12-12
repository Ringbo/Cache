diff --git a/graylog2-shared/src/main/java/org/graylog2/shared/inputs/InputRegistry.java b/graylog2-shared/src/main/java/org/graylog2/shared/inputs/InputRegistry.java
index 0a817cd..017cb2c 100644
--- a/graylog2-shared/src/main/java/org/graylog2/shared/inputs/InputRegistry.java
+++ b/graylog2-shared/src/main/java/org/graylog2/shared/inputs/InputRegistry.java
@@ -92,7 +92,7 @@
         if (inputState != null)
             inputState.setState(IOState.Type.TERMINATED);
 
-        return super.remove(input);
+        return super.remove(inputState);
     }
 
     public boolean remove(IOState<MessageInput> inputState) {
