diff --git a/fab/fab-core/src/main/java/org/fusesource/fabric/fab/MavenResolverImpl.java b/fab/fab-core/src/main/java/org/fusesource/fabric/fab/MavenResolverImpl.java
index 571019a..2b2fb94 100644
--- a/fab/fab-core/src/main/java/org/fusesource/fabric/fab/MavenResolverImpl.java
+++ b/fab/fab-core/src/main/java/org/fusesource/fabric/fab/MavenResolverImpl.java
@@ -567,7 +567,7 @@
                     snapshot = true;
                 } else if (postfix.equals("noreleases")) {
                     // TODO
-                } else if (postfix.equals("id")) {
+                } else if (postfix.startsWith("id")) {
                     //DO NOTHING
                 } else {
                     LOGGER.warn("Unknown postfix: @" + postfix + " on repository URL: " + text);
