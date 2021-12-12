diff --git a/app/src/processing/app/macosx/Platform.java b/app/src/processing/app/macosx/Platform.java
index eb0d5a6..34151db 100644
--- a/app/src/processing/app/macosx/Platform.java
+++ b/app/src/processing/app/macosx/Platform.java
@@ -232,7 +232,7 @@
       CommandLine toDevicePath = CommandLine.parse("/usr/sbin/system_profiler SPUSBDataType");
       executor.execute(toDevicePath);
       return new String(baos.toByteArray());
-    } catch (IOException e) {
+    } catch (Throwable e) {
       return super.preListAllCandidateDevices();
     }
   }
