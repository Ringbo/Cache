diff --git a/subprojects/wrapper/src/main/java/org/gradle/wrapper/Install.java b/subprojects/wrapper/src/main/java/org/gradle/wrapper/Install.java
index f23ddd6..21a62bc 100644
--- a/subprojects/wrapper/src/main/java/org/gradle/wrapper/Install.java
+++ b/subprojects/wrapper/src/main/java/org/gradle/wrapper/Install.java
@@ -121,7 +121,7 @@
                         + " via SHA-256 hash sum comparison failed! This is a serious problem,"
                         + " it means that you retrieved a different gradle distribution zip than expected."
                         + " Please inform the maintainer!"
-                        + "You can try to delete the cached gradle distribtion at " +
+                        + "You can try to delete the cached gradle distribtion at "
                         + distDir.getAbsolutePath()
                         + " and try again.");
             }
