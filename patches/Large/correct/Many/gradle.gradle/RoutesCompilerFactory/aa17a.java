diff --git a/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompilerFactory.java b/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompilerFactory.java
index 86614da..2b09dbf 100644
--- a/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompilerFactory.java
+++ b/subprojects/platform-play/src/main/java/org/gradle/play/internal/routes/RoutesCompilerFactory.java
@@ -38,7 +38,7 @@
             case PLAY_2_3_X:
                 return new RoutesCompilerAdapterV23X(playVersion);
             case PLAY_2_4_X:
-                if (VersionNumber.parse(playVersion).getMicro() < 6) {
+                if (VersionNumber.parse(playVersion).getMicro() < 6 && !"2.10".equals(scalaVersion)) {
                     LOGGER.warn("Asked to use scala version " + scalaVersion
                         + " on play < 2.4.6. Will have to use the 2.10 routes compiler");
                     scalaVersion = "2.10";
