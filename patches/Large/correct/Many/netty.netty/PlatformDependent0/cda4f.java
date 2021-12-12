diff --git a/common/src/main/java/io/netty/util/internal/PlatformDependent0.java b/common/src/main/java/io/netty/util/internal/PlatformDependent0.java
index 7d56356..c6ebb55 100644
--- a/common/src/main/java/io/netty/util/internal/PlatformDependent0.java
+++ b/common/src/main/java/io/netty/util/internal/PlatformDependent0.java
@@ -368,7 +368,7 @@
     }
 
     static boolean isExplicitNoUnsafe() {
-        return EXPLICIT_NO_UNSAFE_CAUSE == null;
+        return EXPLICIT_NO_UNSAFE_CAUSE != null;
     }
 
     private static Throwable explicitNoUnsafeCause0() {
