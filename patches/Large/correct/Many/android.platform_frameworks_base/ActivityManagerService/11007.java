diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index ec0e075..e3a0b5c 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -12291,10 +12291,11 @@
                                     + " from " + proc.initialIdlePss + ")", true);
                         }
                     }
-                } else if (proc.setProcState < ActivityManager.PROCESS_STATE_HOME) {
+                } else if (proc.setProcState < ActivityManager.PROCESS_STATE_HOME
+                        && proc.setProcState > ActivityManager.PROCESS_STATE_NONEXISTENT) {
                     proc.notCachedSinceIdle = true;
                     proc.initialIdlePss = 0;
-                    proc.nextPssTime = ProcessList.computeNextPssTime(proc.curProcState, true,
+                    proc.nextPssTime = ProcessList.computeNextPssTime(proc.setProcState, true,
                             mTestPssMode, isSleeping(), now);
                 }
             }
