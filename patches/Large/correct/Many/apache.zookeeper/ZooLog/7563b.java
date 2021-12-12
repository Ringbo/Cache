diff --git a/zookeeper/java/src/com/yahoo/zookeeper/server/ZooLog.java b/zookeeper/java/src/com/yahoo/zookeeper/server/ZooLog.java
index 618aa64..7e75511 100644
--- a/zookeeper/java/src/com/yahoo/zookeeper/server/ZooLog.java
+++ b/zookeeper/java/src/com/yahoo/zookeeper/server/ZooLog.java
@@ -62,7 +62,7 @@
         StackTraceElement ste = re.getStackTrace()[1];
         String location = ZooLog.stackTrace2Location(ste);
         ZooLog.logError(mess, location);
-        ZooLog.logTextTraceMessage(mess + "location: \n" + location,
+        ZooLog.logTextTraceMessage(mess + "location: " + location,
                 textTraceMask);
     }
 
@@ -193,7 +193,7 @@
         sb.append(header).append(":").append(rp);
         sb.append(request.toString());
         write(os, sb.toString());
-        write(textTos, "\n\n");
+        write(textTos, "\n");
     }
 
     static private void writeText(FileChannel os, String message,
@@ -206,7 +206,7 @@
                 .append(location).append(" ");
         sb.append(message);
         write(os, sb.toString());
-        write(textTos, "\n\n");
+        write(textTos, "\n");
     }
 
     static private long ROLLOVER_TIME = 24 * 3600 * 1000;
@@ -235,19 +235,19 @@
             if (requestTraceFile == null) {
                 return;
             }
-            requestTraceFile += "." + year + "." + month + "." + day;
+           String currentTextFile = requestTraceFile +  "." + year + "." + month + "." + day;
 
             try {
-                textTos = new FileOutputStream(requestTraceFile + ".txt", true)
+                textTos = new FileOutputStream(currentTextFile + ".txt", true)
                         .getChannel();
                 textTosCreationTime = time;
-                write(textTos, "\n\n");
+                write(textTos, "\n");
             } catch (IOException e) {
                 ZooLog.logException(e);
                 return;
             }
             ZooLog.logWarn("*********** Traced requests text saved to "
-                    + requestTraceFile + ".txt");
+                    + currentTextFile + ".txt");
         }
     }
 
