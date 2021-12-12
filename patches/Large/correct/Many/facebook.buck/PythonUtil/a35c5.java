diff --git a/src/com/facebook/buck/python/PythonUtil.java b/src/com/facebook/buck/python/PythonUtil.java
index f187ec5..3773845 100644
--- a/src/com/facebook/buck/python/PythonUtil.java
+++ b/src/com/facebook/buck/python/PythonUtil.java
@@ -210,7 +210,7 @@
           omnibusRoots.addIncludedRoot(target);
           List<BuildRule> cxxpydeps = new ArrayList<>();
           for (BuildRule dep : extension.getPythonPackageDeps(pythonPlatform, cxxPlatform)) {
-            if (dep instanceof CxxPythonExtension) {
+            if (dep instanceof PythonPackagable) {
               cxxpydeps.add(dep);
             }
           }
