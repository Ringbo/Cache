diff --git a/core/java/android/os/RecoverySystem.java b/core/java/android/os/RecoverySystem.java
index d48431a..3ac6019 100644
--- a/core/java/android/os/RecoverySystem.java
+++ b/core/java/android/os/RecoverySystem.java
@@ -483,7 +483,7 @@
             }
 
             final String filenameArg = "--update_package=" + filename + "\n";
-            final String localeArg = "--locale=" + Locale.getDefault().toString() + "\n";
+            final String localeArg = "--locale=" + Locale.getDefault().toLanguageTag() + "\n";
             final String securityArg = "--security\n";
 
             String command = filenameArg + localeArg;
@@ -531,7 +531,7 @@
         }
 
         final String filenameArg = "--update_package=" + filename + "\n";
-        final String localeArg = "--locale=" + Locale.getDefault().toString() + "\n";
+        final String localeArg = "--locale=" + Locale.getDefault().toLanguageTag() + "\n";
         final String securityArg = "--security\n";
 
         String command = filenameArg + localeArg;
@@ -646,7 +646,7 @@
             reasonArg = "--reason=" + sanitizeArg(reason);
         }
 
-        final String localeArg = "--locale=" + Locale.getDefault().toString();
+        final String localeArg = "--locale=" + Locale.getDefault().toLanguageTag() ;
         bootCommand(context, shutdownArg, "--wipe_data", reasonArg, localeArg);
     }
 
@@ -665,7 +665,7 @@
             reasonArg = "--reason=" + sanitizeArg(reason);
         }
 
-        final String localeArg = "--locale=" + Locale.getDefault().toString();
+        final String localeArg = "--locale=" + Locale.getDefault().toLanguageTag() ;
         bootCommand(context, "--wipe_cache", reasonArg, localeArg);
     }
 
@@ -690,7 +690,7 @@
 
         final String filename = packageFile.getCanonicalPath();
         final String filenameArg = "--wipe_package=" + filename;
-        final String localeArg = "--locale=" + Locale.getDefault().toString();
+        final String localeArg = "--locale=" + Locale.getDefault().toLanguageTag() ;
         bootCommand(context, "--wipe_ab", filenameArg, reasonArg, localeArg);
     }
 
