diff --git a/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java b/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java
index 914e02f..648af51 100644
--- a/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java
+++ b/flyway-commandline/src/main/java/org/flywaydb/commandline/Main.java
@@ -415,7 +415,7 @@
             return;
         }
 
-        if (!properties.contains("flyway.url")) {
+        if (!properties.containsKey("flyway.url")) {
             // URL is not set. We are doomed for failure anyway.
             return;
         }
