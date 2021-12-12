diff --git a/src/com/google/javascript/jscomp/DefaultPassConfig.java b/src/com/google/javascript/jscomp/DefaultPassConfig.java
index a44241e..2371989 100644
--- a/src/com/google/javascript/jscomp/DefaultPassConfig.java
+++ b/src/com/google/javascript/jscomp/DefaultPassConfig.java
@@ -280,7 +280,7 @@
       checks.add(angularPass);
     }
 
-    if (options.checkProvides.isOn()) {
+    if (options.checkProvides.isOn() || options.enables(DiagnosticGroups.MISSING_PROVIDE)) {
       checks.add(checkProvides);
     }
 
