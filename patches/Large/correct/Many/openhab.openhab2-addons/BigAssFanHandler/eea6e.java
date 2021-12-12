diff --git a/addons/binding/org.openhab.binding.bigassfan/src/main/java/org/openhab/binding/bigassfan/handler/BigAssFanHandler.java b/addons/binding/org.openhab.binding.bigassfan/src/main/java/org/openhab/binding/bigassfan/handler/BigAssFanHandler.java
index 9a89da5..0faad5c 100644
--- a/addons/binding/org.openhab.binding.bigassfan/src/main/java/org/openhab/binding/bigassfan/handler/BigAssFanHandler.java
+++ b/addons/binding/org.openhab.binding.bigassfan/src/main/java/org/openhab/binding/bigassfan/handler/BigAssFanHandler.java
@@ -732,7 +732,7 @@
                 logger.debug("FAN;WHOOSH has unexpected number of parameters: {}", Arrays.toString(messageParts));
                 return;
             }
-            OnOffType state = messageParts[3].toUpperCase().equals("ON") ? OnOffType.ON : OnOffType.OFF;
+            OnOffType state = messageParts[4].toUpperCase().equals("ON") ? OnOffType.ON : OnOffType.OFF;
             updateChannel(CHANNEL_FAN_WHOOSH, state);
             fanStateMap.put(CHANNEL_FAN_WHOOSH, state);
         }
