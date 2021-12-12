diff --git a/src/org/traccar/protocol/WatchProtocolEncoder.java b/src/org/traccar/protocol/WatchProtocolEncoder.java
index f66ba40..431b045 100644
--- a/src/org/traccar/protocol/WatchProtocolEncoder.java
+++ b/src/org/traccar/protocol/WatchProtocolEncoder.java
@@ -37,7 +37,7 @@
             DecimalFormat fmt = new DecimalFormat("+#.##;-#.##", DecimalFormatSymbols.getInstance(Locale.US));
             return fmt.format(offset);
         } else if (key.equals(Command.KEY_MESSAGE)) {
-            return DataConverter.printHex(value.toString().getBytes());
+            return DataConverter.printHex(value.toString().getBytes(StandardCharsets.UTF_16BE));
         }
 
         return null;
