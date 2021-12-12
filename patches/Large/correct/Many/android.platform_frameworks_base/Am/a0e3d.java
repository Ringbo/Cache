diff --git a/cmds/am/src/com/android/commands/am/Am.java b/cmds/am/src/com/android/commands/am/Am.java
index 8ccd5d2e..d6c0058 100644
--- a/cmds/am/src/com/android/commands/am/Am.java
+++ b/cmds/am/src/com/android/commands/am/Am.java
@@ -723,10 +723,10 @@
                 System.out.println("Complete");
             }
             mRepeat--;
-            if (mRepeat > 1) {
+            if (mRepeat > 0) {
                 mAm.unhandledBack();
             }
-        } while (mRepeat > 1);
+        } while (mRepeat > 0);
     }
 
     private void runForceStop() throws Exception {
