diff --git a/camel-core/src/main/java/org/apache/camel/util/EventHelper.java b/camel-core/src/main/java/org/apache/camel/util/EventHelper.java
index bf751ef..50ee5b3 100644
--- a/camel-core/src/main/java/org/apache/camel/util/EventHelper.java
+++ b/camel-core/src/main/java/org/apache/camel/util/EventHelper.java
@@ -818,7 +818,7 @@
             if (notifier.isDisabled()) {
                 continue;
             }
-            if (notifier.isIgnoreExchangeEvents() || notifier.isIgnoreExchangeSentEvents()) {
+            if (notifier.isIgnoreExchangeEvents() || notifier.isIgnoreExchangeSendingEvents()) {
                 continue;
             }
 
