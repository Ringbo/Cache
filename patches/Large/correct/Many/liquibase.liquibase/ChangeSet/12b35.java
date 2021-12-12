diff --git a/liquibase-core/src/main/java/liquibase/changelog/ChangeSet.java b/liquibase-core/src/main/java/liquibase/changelog/ChangeSet.java
index 7230c20..6a039eb 100644
--- a/liquibase-core/src/main/java/liquibase/changelog/ChangeSet.java
+++ b/liquibase-core/src/main/java/liquibase/changelog/ChangeSet.java
@@ -582,7 +582,8 @@
                 log.debug("Failure Stacktrace", e);
                 execType = ExecType.FAILED;
             } else {
-                log.severe("Change Set " + toString(false) + " failed.  Error: " + e.getMessage(), e);
+                // just log the message, dont log the stacktrace by appending exception. Its logged anyway to stdout
+                log.severe("Change Set " + toString(false) + " failed.  Error: " + e.getMessage());
                 if (e instanceof MigrationFailedException) {
                     throw ((MigrationFailedException) e);
                 } else {
