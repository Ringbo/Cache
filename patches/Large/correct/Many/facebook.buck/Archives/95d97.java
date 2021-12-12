diff --git a/src/com/facebook/buck/cxx/Archives.java b/src/com/facebook/buck/cxx/Archives.java
index eca5147..4f6bcb2 100644
--- a/src/com/facebook/buck/cxx/Archives.java
+++ b/src/com/facebook/buck/cxx/Archives.java
@@ -49,7 +49,7 @@
   public static Path getArchiveOutputPath(BuildTarget target) {
     return BuildTargets.getGenPath(
         target,
-        "%s/lib" + target.getShortName() + ".a");
+        "%s/lib" + target.getShortNameOnly() + ".a");
   }
 
   /**
