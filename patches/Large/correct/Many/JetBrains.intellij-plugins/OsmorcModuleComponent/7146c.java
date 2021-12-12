diff --git a/osmorc/src/org/osmorc/OsmorcModuleComponent.java b/osmorc/src/org/osmorc/OsmorcModuleComponent.java
index af5ea74..349e4fb 100644
--- a/osmorc/src/org/osmorc/OsmorcModuleComponent.java
+++ b/osmorc/src/org/osmorc/OsmorcModuleComponent.java
@@ -119,7 +119,7 @@
           }
           myBundleManager.reindex(myModule);
         }
-      });
+      }, myModule.getDisposed());
     }
   }
 
