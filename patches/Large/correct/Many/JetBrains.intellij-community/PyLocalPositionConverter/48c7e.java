diff --git a/python/src/com/jetbrains/python/debugger/PyLocalPositionConverter.java b/python/src/com/jetbrains/python/debugger/PyLocalPositionConverter.java
index b133f2a..55dd0b2 100644
--- a/python/src/com/jetbrains/python/debugger/PyLocalPositionConverter.java
+++ b/python/src/com/jetbrains/python/debugger/PyLocalPositionConverter.java
@@ -33,7 +33,7 @@
   }
 
   protected static class PyRemoteSourcePosition extends PySourcePosition {
-    PyRemoteSourcePosition(final String file, final int line) {
+    public PyRemoteSourcePosition(final String file, final int line) {
       super(file, line);
     }
 
