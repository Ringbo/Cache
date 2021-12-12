diff --git a/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java b/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java
index 11f6568..a098b55 100644
--- a/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java
+++ b/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java
@@ -109,7 +109,7 @@
     }
 
     private BaseHome baseHome;
-    private StartArgs startupArgs;
+    private StartArgs jsvcStartArgs;
 
     public Main() throws IOException
     {
@@ -486,7 +486,7 @@
         catch (Throwable e)
         {
             e.printStackTrace();
-            usageExit(e,ERR_INVOKE_MAIN,startupArgs.isTestingModeEnabled());
+            usageExit(e,ERR_INVOKE_MAIN,args.isTestingModeEnabled());
         }
     }
 
@@ -573,11 +573,11 @@
         }
         catch (ConnectException e)
         {
-            usageExit(e,ERR_NOT_STOPPED,startupArgs.isTestingModeEnabled());
+            usageExit(e,ERR_NOT_STOPPED,jsvcStartArgs.isTestingModeEnabled());
         }
         catch (Exception e)
         {
-            usageExit(e,ERR_UNKNOWN,startupArgs.isTestingModeEnabled());
+            usageExit(e,ERR_UNKNOWN,jsvcStartArgs.isTestingModeEnabled());
         }
     }
 
@@ -630,29 +630,35 @@
     {
         try
         {
-            startupArgs = processCommandLine(args);
+            jsvcStartArgs = processCommandLine(args);
         }
         catch (UsageException e)
         {
             StartLog.error(e.getMessage());
-            usageExit(e.getCause(),e.getExitCode(),startupArgs.isTestingModeEnabled());
+            usageExit(e.getCause(),e.getExitCode(),false);
         }
         catch (Throwable e)
         {
-            usageExit(e,UsageException.ERR_UNKNOWN,startupArgs.isTestingModeEnabled());
+            usageExit(e,UsageException.ERR_UNKNOWN,false);
         }
     }
 
+    // ------------------------------------------------------------
+    // implement Apache commons daemon (jsvc) lifecycle methods (init, start, stop, destroy)
     public void start() throws Exception
     {
-        start(startupArgs);
+        start(jsvcStartArgs);
     }
 
+    // ------------------------------------------------------------
+    // implement Apache commons daemon (jsvc) lifecycle methods (init, start, stop, destroy)
     public void stop() throws Exception
     {
-        doStop(startupArgs);
+        doStop(jsvcStartArgs);
     }
 
+    // ------------------------------------------------------------
+    // implement Apache commons daemon (jsvc) lifecycle methods (init, start, stop, destroy)
     public void destroy()
     {
     }
