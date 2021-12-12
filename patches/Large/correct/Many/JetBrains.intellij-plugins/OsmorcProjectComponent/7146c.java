diff --git a/osmorc/src/org/osmorc/OsmorcProjectComponent.java b/osmorc/src/org/osmorc/OsmorcProjectComponent.java
index 2f9a169..97c2fd5 100644
--- a/osmorc/src/org/osmorc/OsmorcProjectComponent.java
+++ b/osmorc/src/org/osmorc/OsmorcProjectComponent.java
@@ -116,7 +116,7 @@
           }
         }, 500);
       }
-    });
+    }, myProject.getDisposed());
   }
 
 
@@ -134,7 +134,7 @@
           }
         }.queue();
       }
-    });
+    }, myProject.getDisposed());
   }
 
 
