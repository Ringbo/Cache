diff --git a/platform/util/src/com/intellij/openapi/util/SystemInfo.java b/platform/util/src/com/intellij/openapi/util/SystemInfo.java
index d7ec8a8..98ef281 100644
--- a/platform/util/src/com/intellij/openapi/util/SystemInfo.java
+++ b/platform/util/src/com/intellij/openapi/util/SystemInfo.java
@@ -41,7 +41,7 @@
   public static final boolean isUnix = SystemInfoRt.isUnix;
 
   public static boolean isOsVersionAtLeast(@NotNull String version) {
-    return StringUtil.compareVersionNumbers(version, OS_VERSION) >= 0;
+    return StringUtil.compareVersionNumbers(OS_VERSION, version) >= 0;
   }
 
   // version numbers from http://msdn.microsoft.com/en-us/library/windows/desktop/ms724832.aspx
