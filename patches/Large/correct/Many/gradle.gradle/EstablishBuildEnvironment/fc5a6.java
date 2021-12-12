diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/exec/EstablishBuildEnvironment.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/exec/EstablishBuildEnvironment.java
index f50beb5..753bbb0 100755
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/exec/EstablishBuildEnvironment.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/server/exec/EstablishBuildEnvironment.java
@@ -54,7 +54,8 @@
             if (SystemProperties.getInstance().getNonStandardImportantProperties().contains(entry.getKey())) {
                 continue;
             }
-            if (entry.getKey().startsWith("sun.")) {
+            if (entry.getKey().startsWith("sun.") || entry.getKey().startsWith("awt.")
+                    || entry.getKey().contains(".awt.")) {
                 continue;
             }
             System.setProperty(entry.getKey(), entry.getValue());
