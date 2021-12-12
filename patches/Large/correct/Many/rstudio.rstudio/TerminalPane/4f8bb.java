diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java
index 476608c..fe4ceca 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/terminal/TerminalPane.java
@@ -333,7 +333,7 @@
                Debug.log("No selected terminal after creation"); 
                return; 
             } 
-            terminal.receivedInput(postCreateText);
+            terminal.receivedSendToTerminal(postCreateText);
          }
          
          @Override
@@ -849,7 +849,7 @@
                Debug.log("Terminal not found after switching"); 
                return; 
             } 
-            terminal.receivedInput(event.getInputText()); 
+            terminal.receivedSendToTerminal(event.getInputText()); 
          } 
          @Override 
          public void onFailure(String msg) 
