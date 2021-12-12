diff --git a/java/org/apache/catalina/startup/Bootstrap.java b/java/org/apache/catalina/startup/Bootstrap.java
index f7cedea..1ab7a7f 100644
--- a/java/org/apache/catalina/startup/Bootstrap.java
+++ b/java/org/apache/catalina/startup/Bootstrap.java
@@ -142,7 +142,7 @@
                 }
             }
             if (replace && log.isDebugEnabled())
-                log.debug("Expanded " + before + " to " + replace);
+                log.debug("Expanded " + before + " to " + repository);
 
             // Check for a JAR URL repository
             try {
