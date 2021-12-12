diff --git a/src/com/facebook/buck/python/PythonUtil.java b/src/com/facebook/buck/python/PythonUtil.java
index c604693..7555cbb 100644
--- a/src/com/facebook/buck/python/PythonUtil.java
+++ b/src/com/facebook/buck/python/PythonUtil.java
@@ -270,7 +270,7 @@
             allComponents.addNativeLibraries(
                 Paths.get(ent.getKey()),
                 ent.getValue(),
-                params.getBuildTarget());
+                nativeLinkable.getBuildTarget());
           }
         }
       }
