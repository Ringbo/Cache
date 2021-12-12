diff --git a/sdk/jme3-core/src/com/jme3/gde/core/scene/ApplicationLogHandler.java b/sdk/jme3-core/src/com/jme3/gde/core/scene/ApplicationLogHandler.java
index d931ec1..b6a368e 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/scene/ApplicationLogHandler.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/scene/ApplicationLogHandler.java
@@ -116,15 +116,15 @@
                 NotifyUtil.error(thrown);
                 thrown.printStackTrace(io.getErr());
             } else {
-                NotifyUtil.show("Error", formatter.format(record), MessageType.ERROR, listener, 10000);
+                NotifyUtil.show("Error", formatter.format(record), MessageType.ERROR, listener, 0);
                 io.getErr().println(formatter.formatMessage(record));
             }
         } else if (record.getLevel().equals(Level.WARNING)) {
-            NotifyUtil.show("Warning", formatter.formatMessage(record), MessageType.WARNING, listener, 5000);
+            NotifyUtil.show("Warning", formatter.formatMessage(record), MessageType.WARNING, listener, 10000);
             io.getErr().println(formatter.formatMessage(record));
         } else if (record.getLevel().intValue() > 800) {
             //larger than INFO:
-            NotifyUtil.show("Info", formatter.formatMessage(record), MessageType.INFO, listener, 3000);
+            NotifyUtil.show("Info", formatter.formatMessage(record), MessageType.INFO, listener, 6000);
             io.getOut().println(formatter.formatMessage(record));
         } else if (record.getLevel().equals(Level.INFO)) {
             io.getOut().println(formatter.formatMessage(record));
