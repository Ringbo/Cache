diff --git a/util/src/com/intellij/util/io/PagePool.java b/util/src/com/intellij/util/io/PagePool.java
index 1217cf8..5e5a5e3 100644
--- a/util/src/com/intellij/util/io/PagePool.java
+++ b/util/src/com/intellij/util/io/PagePool.java
@@ -239,7 +239,7 @@
           }
         }
         catch (Throwable e) {
-          LOG.error(e);
+          LOG.info(e);
         }
       }
     }
