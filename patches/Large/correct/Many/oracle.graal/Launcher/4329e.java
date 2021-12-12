diff --git a/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/Launcher.java b/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/Launcher.java
index 013c284..ddf3e28 100644
--- a/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/Launcher.java
+++ b/sdk/src/org.graalvm.launcher/src/org/graalvm/launcher/Launcher.java
@@ -1159,7 +1159,7 @@
         }
 
         private void printJvmHelp() {
-            System.out.print("JVM options:");
+            System.out.println("JVM options:");
             printOption("--jvm.classpath <...>", "A " + File.pathSeparator + " separated list of classpath entries that will be added to the JVM's classpath");
             printOption("--jvm.D<name>=<value>", "Set a system property");
             printOption("--jvm.esa", "Enable system assertions");
