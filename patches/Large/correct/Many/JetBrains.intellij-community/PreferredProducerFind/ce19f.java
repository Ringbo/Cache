diff --git a/platform/lang-api/src/com/intellij/execution/actions/PreferredProducerFind.java b/platform/lang-api/src/com/intellij/execution/actions/PreferredProducerFind.java
index 56917e0..6973b63 100644
--- a/platform/lang-api/src/com/intellij/execution/actions/PreferredProducerFind.java
+++ b/platform/lang-api/src/com/intellij/execution/actions/PreferredProducerFind.java
@@ -126,7 +126,7 @@
       final ConfigurationFromContext first = configurationsFromContext.get(0);
       for (Iterator<ConfigurationFromContext> it = configurationsFromContext.iterator(); it.hasNext();) {
         ConfigurationFromContext producer = it.next();
-        if (producer != first && ConfigurationFromContext.COMPARATOR.compare(producer, first) >= 0) {
+        if (producer != first && ConfigurationFromContext.COMPARATOR.compare(producer, first) > 0) {
           it.remove();
         }
       }
