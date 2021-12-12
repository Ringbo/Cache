diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index a8e63f6..0a95e2a 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -18906,7 +18906,7 @@
                                 thread.dumpMemInfo(tp.getWriteFd(),
                                         mi, opts.isCheckinRequest, opts.dumpFullDetails,
                                         opts.dumpDalvik, opts.dumpSummaryOnly, opts.dumpUnreachable, innerArgs);
-                                tp.go(fd);
+                                tp.go(fd, opts.dumpUnreachable ? 30000 : 5000);
                             } finally {
                                 tp.kill();
                             }
