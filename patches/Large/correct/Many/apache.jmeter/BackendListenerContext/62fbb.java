diff --git a/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java b/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java
index adb52bf..ab7f1a0 100644
--- a/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java
+++ b/src/components/org/apache/jmeter/visualizers/backend/BackendListenerContext.java
@@ -133,7 +133,7 @@
      */
     public int getIntParameter(String name) throws NumberFormatException {
         if (params == null || !params.containsKey(name)) {
-            throw new NumberFormatException("No value for parameter named '" + name + "'.");
+            throw new IllegalArgumentException("No value for parameter named '" + name + "'.");
         }
 
         return Integer.parseInt(params.get(name));
