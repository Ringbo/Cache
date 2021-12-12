diff --git a/core/common/src/main/java/alluxio/underfs/options/MkdirsOptions.java b/core/common/src/main/java/alluxio/underfs/options/MkdirsOptions.java
index d65c42e..d3b90db 100644
--- a/core/common/src/main/java/alluxio/underfs/options/MkdirsOptions.java
+++ b/core/common/src/main/java/alluxio/underfs/options/MkdirsOptions.java
@@ -97,7 +97,7 @@
     if (this == o) {
       return true;
     }
-    if (!(o instanceof CreateOptions)) {
+    if (!(o instanceof MkdirsOptions)) {
       return false;
     }
     MkdirsOptions that = (MkdirsOptions) o;
