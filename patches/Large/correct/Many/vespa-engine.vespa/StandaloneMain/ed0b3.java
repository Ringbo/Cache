diff --git a/jdisc_core/src/main/java/com/yahoo/jdisc/core/StandaloneMain.java b/jdisc_core/src/main/java/com/yahoo/jdisc/core/StandaloneMain.java
index cd52a72..a78e4f1 100644
--- a/jdisc_core/src/main/java/com/yahoo/jdisc/core/StandaloneMain.java
+++ b/jdisc_core/src/main/java/com/yahoo/jdisc/core/StandaloneMain.java
@@ -47,7 +47,7 @@
             loader.destroy();
             System.out.println("debug\tStopped ok.");
             System.exit(0);
-        } catch (Exception e) {
+        } catch (Throwable e) {
             System.out.print("debug\tUnexpected: ");
             e.printStackTrace();
             log.log(Level.SEVERE, "Unexpected: ", e);
