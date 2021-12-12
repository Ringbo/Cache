diff --git a/cli/src/main/java/org/jboss/as/cli/handlers/OperationRequestHandler.java b/cli/src/main/java/org/jboss/as/cli/handlers/OperationRequestHandler.java
index 12ab0f9..2365a3e 100644
--- a/cli/src/main/java/org/jboss/as/cli/handlers/OperationRequestHandler.java
+++ b/cli/src/main/java/org/jboss/as/cli/handlers/OperationRequestHandler.java
@@ -66,7 +66,7 @@
 
         ModelNode request = (ModelNode) ctx.get("OP_REQ");
         if(request == null) {
-            throw new CommandFormatException("Parsed request isn't available.");
+            throw new CommandLineException("Parsed request isn't available.");
         }
 
         if(ctx.getConfig().isValidateOperationRequests()) {
@@ -78,17 +78,17 @@
             if(Util.isSuccess(result)) {
                 ctx.printLine(result.toString());
             } else {
-                throw new CommandFormatException(result.toString());
+                throw new CommandLineException(result.toString());
             }
         } catch(NoSuchElementException e) {
-            throw new CommandFormatException("ModelNode request is incomplete", e);
+            throw new CommandLineException("ModelNode request is incomplete", e);
         } catch (CancellationException e) {
-            throw new CommandFormatException("The result couldn't be retrieved (perhaps the task was cancelled", e);
+            throw new CommandLineException("The result couldn't be retrieved (perhaps the task was cancelled", e);
         } catch (IOException e) {
             ctx.disconnectController();
-            throw new CommandFormatException("Communication error", e);
+            throw new CommandLineException("Communication error", e);
         } catch (RuntimeException e) {
-            throw new CommandFormatException("Failed to execute operation.", e);
+            throw new CommandLineException("Failed to execute operation.", e);
         }
     }
 
