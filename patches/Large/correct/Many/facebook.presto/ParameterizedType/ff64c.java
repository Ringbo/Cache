diff --git a/presto-main/src/main/java/com/facebook/presto/byteCode/ParameterizedType.java b/presto-main/src/main/java/com/facebook/presto/byteCode/ParameterizedType.java
index 40fab0e..11819f8 100644
--- a/presto-main/src/main/java/com/facebook/presto/byteCode/ParameterizedType.java
+++ b/presto-main/src/main/java/com/facebook/presto/byteCode/ParameterizedType.java
@@ -175,7 +175,7 @@
     public String getGenericSignature()
     {
         StringBuilder sb = new StringBuilder();
-        if (primitiveType != null) {
+        if (primitiveType != null || arrayComponentType != null) {
             return type;
         }
         sb.append('L').append(className);
