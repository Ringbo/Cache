diff --git a/services/java/com/android/server/pm/Settings.java b/services/java/com/android/server/pm/Settings.java
index 36442a0..f0f5414 100644
--- a/services/java/com/android/server/pm/Settings.java
+++ b/services/java/com/android/server/pm/Settings.java
@@ -971,7 +971,7 @@
 
                     // Avoid any application that has a space in its path
                     // or that is handled by the system.
-                    if (dataPath.indexOf(" ") >= 0 || ai.uid <= Process.FIRST_APPLICATION_UID)
+                    if (dataPath.indexOf(" ") >= 0 || ai.uid < Process.FIRST_APPLICATION_UID)
                         continue;
 
                     // we store on each line the following information for now:
