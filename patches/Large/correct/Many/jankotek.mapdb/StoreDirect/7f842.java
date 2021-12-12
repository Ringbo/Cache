diff --git a/src/main/java/org/mapdb/StoreDirect.java b/src/main/java/org/mapdb/StoreDirect.java
index 393fd40..ad0844a 100644
--- a/src/main/java/org/mapdb/StoreDirect.java
+++ b/src/main/java/org/mapdb/StoreDirect.java
@@ -90,7 +90,7 @@
                 structuralLock.unlock();
             }
         }finally {
-            commitLock.lock();
+            commitLock.unlock();
         }
     }
 
