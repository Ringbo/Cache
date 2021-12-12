diff --git a/osmorc/src/org/osmorc/ModuleDependencySynchronizer.java b/osmorc/src/org/osmorc/ModuleDependencySynchronizer.java
index 9582577..6f6164b 100644
--- a/osmorc/src/org/osmorc/ModuleDependencySynchronizer.java
+++ b/osmorc/src/org/osmorc/ModuleDependencySynchronizer.java
@@ -95,7 +95,7 @@
           }
         }.queue();
       }
-    });
+    },project.getDisposed());
   }
 
   /**
