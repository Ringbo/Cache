diff --git a/services/java/com/android/server/NetworkManagementService.java b/services/java/com/android/server/NetworkManagementService.java
index 6d121c3..53076de 100644
--- a/services/java/com/android/server/NetworkManagementService.java
+++ b/services/java/com/android/server/NetworkManagementService.java
@@ -447,7 +447,7 @@
             String []tok = line.split(" ");
             int code = Integer.parseInt(tok[0]);
             if (code == NetdResponseCode.UsbRNDISStatusResult) {
-                if (tok[2].equals("started"))
+                if (tok[3].equals("started"))
                     return true;
                 return false;
             } else {
