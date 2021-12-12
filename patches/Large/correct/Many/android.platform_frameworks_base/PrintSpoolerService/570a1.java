diff --git a/packages/PrintSpooler/src/com/android/printspooler/model/PrintSpoolerService.java b/packages/PrintSpooler/src/com/android/printspooler/model/PrintSpoolerService.java
index bafccae..cad8c39 100644
--- a/packages/PrintSpooler/src/com/android/printspooler/model/PrintSpoolerService.java
+++ b/packages/PrintSpooler/src/com/android/printspooler/model/PrintSpoolerService.java
@@ -1168,7 +1168,7 @@
                     if (TYPE_STRING.equals(type)) {
                         advancedOptions.putString(key, value);
                     } else if (TYPE_INT.equals(type)) {
-                        advancedOptions.putInt(key, Integer.valueOf(value));
+                        advancedOptions.putInt(key, Integer.parseInt(value));
                     }
                     parser.next();
                     skipEmptyTextTags(parser);
