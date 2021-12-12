diff --git a/src/main/java/org/testng/internal/ClassHelper.java b/src/main/java/org/testng/internal/ClassHelper.java
index b02a8d0..df0de09 100644
--- a/src/main/java/org/testng/internal/ClassHelper.java
+++ b/src/main/java/org/testng/internal/ClassHelper.java
@@ -591,16 +591,16 @@
     // resolves.  When it does, we remember the path we are at as "lastGoodRoodIndex".
     //
 
-    StringBuilder className = new StringBuilder();
+    String className = "";
     for (int i = segments.length - 1; i >= 0; i--) {
       if (className.length() == 0) {
-        className.append(segments[i]);
+        className = segments[i];
       }
       else {
-        className.append(segments[i]).append(".").append(className);
+        className = segments[i] + "."  + className;
       }
 
-      result = ClassHelper.forName(className.toString());
+      result = ClassHelper.forName(className);
 
       if (null != result) {
         lastGoodRootIndex = i;
