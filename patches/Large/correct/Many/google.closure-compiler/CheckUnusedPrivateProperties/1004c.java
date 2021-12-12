diff --git a/src/com/google/javascript/jscomp/CheckUnusedPrivateProperties.java b/src/com/google/javascript/jscomp/CheckUnusedPrivateProperties.java
index 3af22cc..8d58eec 100644
--- a/src/com/google/javascript/jscomp/CheckUnusedPrivateProperties.java
+++ b/src/com/google/javascript/jscomp/CheckUnusedPrivateProperties.java
@@ -66,7 +66,7 @@
     for (Node n : candidates) {
       String propName = getPropName(n);
       if (!used.contains(propName)) {
-        t.report(n, UNUSED_PRIVATE_PROPERTY);
+        t.report(n, UNUSED_PRIVATE_PROPERTY, propName);
       }
     }
   }
