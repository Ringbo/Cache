diff --git a/services/core/java/com/android/server/pm/Settings.java b/services/core/java/com/android/server/pm/Settings.java
index d99408f..56835f6 100644
--- a/services/core/java/com/android/server/pm/Settings.java
+++ b/services/core/java/com/android/server/pm/Settings.java
@@ -4867,7 +4867,7 @@
             pw.print(" enabled=");
             pw.print(ps.getEnabled(user.id));
             pw.print(" instant=");
-            pw.println(ps.getInstantApp(user.id));
+            pw.print(ps.getInstantApp(user.id));
             pw.print(" virtual=");
             pw.println(ps.getVirtulalPreload(user.id));
 
