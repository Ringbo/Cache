diff --git a/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java b/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java
index d9999fa..3a6c2a6 100644
--- a/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java
+++ b/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java
@@ -1205,7 +1205,7 @@
     if (!delayKeyEvents.get()) return false;
     long currentTypeaheadDelay = System.currentTimeMillis() - lastTypeaheadTimestamp;
     if (currentTypeaheadDelay > Registry.get("action.aware.typeaheadTimout").asDouble()) {
-      TYPEAHEAD_LOG.warn(new RuntimeException("Typeahead timeout is exceeded: " + currentTypeaheadDelay));
+      TYPEAHEAD_LOG.error(new RuntimeException("Typeahead timeout is exceeded: " + currentTypeaheadDelay));
       return true;
     }
     return false;
