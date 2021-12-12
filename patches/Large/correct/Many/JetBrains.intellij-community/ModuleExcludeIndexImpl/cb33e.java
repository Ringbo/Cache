diff --git a/jps/jps-builders/src/org/jetbrains/jps/indices/impl/ModuleExcludeIndexImpl.java b/jps/jps-builders/src/org/jetbrains/jps/indices/impl/ModuleExcludeIndexImpl.java
index ae32c4f..28c1717 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/indices/impl/ModuleExcludeIndexImpl.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/indices/impl/ModuleExcludeIndexImpl.java
@@ -106,7 +106,7 @@
           if (module != null) {
             myModuleToExcludesMap.get(module).add(excluded);
           }
-          parent = parent.getParentFile();
+          parent = FileUtil.getParentFile(parent);
         }
         myExcludedRoots.add(excluded);
       }
