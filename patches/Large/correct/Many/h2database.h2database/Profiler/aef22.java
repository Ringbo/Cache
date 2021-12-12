diff --git a/h2/src/main/org/h2/util/Profiler.java b/h2/src/main/org/h2/util/Profiler.java
index 416411f..c3430fe 100644
--- a/h2/src/main/org/h2/util/Profiler.java
+++ b/h2/src/main/org/h2/util/Profiler.java
@@ -282,7 +282,7 @@
                     throw new RuntimeException(e);
                 }
             }
-        }.run();
+        }.start();
     }
 
     /**
