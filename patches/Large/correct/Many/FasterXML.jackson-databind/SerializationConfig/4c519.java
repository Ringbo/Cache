diff --git a/src/main/java/com/fasterxml/jackson/databind/SerializationConfig.java b/src/main/java/com/fasterxml/jackson/databind/SerializationConfig.java
index 119da8a..28aea9b 100644
--- a/src/main/java/com/fasterxml/jackson/databind/SerializationConfig.java
+++ b/src/main/java/com/fasterxml/jackson/databind/SerializationConfig.java
@@ -818,7 +818,7 @@
             }
             g.overrideStdFeatures(newFlags, mask);
         }
-        if (_formatWriteFeatures != 0) {
+        if (_formatWriteFeaturesToChange != 0) {
             g.overrideFormatFeatures(_formatWriteFeatures, _formatWriteFeaturesToChange);
         }
     }
