diff --git a/services/core/java/com/android/server/pm/Settings.java b/services/core/java/com/android/server/pm/Settings.java
index 5c6338d..5177995 100644
--- a/services/core/java/com/android/server/pm/Settings.java
+++ b/services/core/java/com/android/server/pm/Settings.java
@@ -4706,7 +4706,7 @@
         pw.print(prefix); pw.print("  pkgFlags="); printFlags(pw, ps.pkgFlags, FLAG_DUMP_SPEC);
                 pw.println();
 
-        if (ps.pkg.mOverlayTarget != null) {
+        if (ps.pkg != null && ps.pkg.mOverlayTarget != null) {
             pw.print(prefix); pw.print("  overlayTarget="); pw.println(ps.pkg.mOverlayTarget);
             pw.print(prefix); pw.print("  overlayCategory="); pw.println(ps.pkg.mOverlayCategory);
         }
