diff --git a/presto-main/src/main/java/com/facebook/presto/server/PrestoSystemRequirements.java b/presto-main/src/main/java/com/facebook/presto/server/PrestoSystemRequirements.java
index 001c420..7f2abfe 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/PrestoSystemRequirements.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/PrestoSystemRequirements.java
@@ -104,7 +104,7 @@
         }
 
         JavaVersion version = JavaVersion.parse(javaVersion);
-        if (version.getMajor() == 8 && version.getUpdate().isPresent() && version.getUpdate().getAsInt() >= 92) {
+        if (version.getMajor() == 8 && version.getUpdate().isPresent() && version.getUpdate().getAsInt() >= 151) {
             return;
         }
 
@@ -112,7 +112,7 @@
             return;
         }
 
-        failRequirement("Presto requires Java 8u92+ (found %s)", javaVersion);
+        failRequirement("Presto requires Java 8u151+ (found %s)", javaVersion);
     }
 
     private static void verifyUsingG1Gc()
