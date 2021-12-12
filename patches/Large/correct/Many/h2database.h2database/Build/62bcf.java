diff --git a/h2/src/tools/org/h2/build/Build.java b/h2/src/tools/org/h2/build/Build.java
index 4541d1b..a30bd5a 100644
--- a/h2/src/tools/org/h2/build/Build.java
+++ b/h2/src/tools/org/h2/build/Build.java
@@ -257,7 +257,7 @@
         try {
             exec("makensis", args("/v2", "src/installer/h2.nsi"));
             installer = true;
-        } catch (Error e) {
+        } catch (Exception e) {
             print("NSIS is not available: " + e);
         }
         String buildDate = getStaticField("org.h2.engine.Constants", "BUILD_DATE");
