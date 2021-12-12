diff --git a/driver/src/main/org/mongodb/operation/DropIndexOperation.java b/driver/src/main/org/mongodb/operation/DropIndexOperation.java
index 110f58d..f8ba5d4 100644
--- a/driver/src/main/org/mongodb/operation/DropIndexOperation.java
+++ b/driver/src/main/org/mongodb/operation/DropIndexOperation.java
@@ -52,7 +52,7 @@
 
     //TODO: work out a way to reuse this
     private CommandResult ignoreNamespaceNotFoundExceptions(final MongoCommandFailureException e) {
-        if (!e.getCommandResult().getErrorMessage().equals("ns not found")) {
+        if (!e.getCommandResult().getErrorMessage().contains("ns not found")) {
             throw e;
         }
         return e.getCommandResult();
