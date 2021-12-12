diff --git a/src/org/nutz/Nutz.java b/src/org/nutz/Nutz.java
index bda434b..718251b 100644
--- a/src/org/nutz/Nutz.java
+++ b/src/org/nutz/Nutz.java
@@ -33,7 +33,7 @@
      * @return nutz 项目的版本号
      */
     public static String version() {
-        return String.format("%d.%s.%d-SNAPSHOT",
+        return String.format("%d.%s.%d",
                              majorVersion(),
                              releaseLevel(),
                              minorVersion());
@@ -50,7 +50,7 @@
      * 发布流水
      */
     public static int minorVersion() {
-        return 62;
+        return 61;
     }
 
     /**
