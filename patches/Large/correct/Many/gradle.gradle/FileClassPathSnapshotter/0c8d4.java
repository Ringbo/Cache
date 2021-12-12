diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/loadercache/FileClassPathSnapshotter.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/loadercache/FileClassPathSnapshotter.java
index fa35b19..454602f 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/loadercache/FileClassPathSnapshotter.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/initialization/loadercache/FileClassPathSnapshotter.java
@@ -50,7 +50,7 @@
 
         @Override
         public HashCode getStrongHash() {
-            return HashCode.fromInt(hashCode());
+            return HashCode.fromLong(hashCode());
         }
     }
 }
