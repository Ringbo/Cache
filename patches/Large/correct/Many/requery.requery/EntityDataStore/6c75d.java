diff --git a/requery/src/main/java/io/requery/sql/EntityDataStore.java b/requery/src/main/java/io/requery/sql/EntityDataStore.java
index 2b164b9..2758d30 100644
--- a/requery/src/main/java/io/requery/sql/EntityDataStore.java
+++ b/requery/src/main/java/io/requery/sql/EntityDataStore.java
@@ -174,7 +174,7 @@
             entityListeners.add(logListener);
             statementListeners.add(logListener);
         }
-        if (configuration.getEntityStateListener().isEmpty()) {
+        if (!configuration.getEntityStateListener().isEmpty()) {
             for (@SuppressWarnings("unchecked")
                  EntityStateListener<T> listener : configuration.getEntityStateListener()) {
                 entityListeners.add(listener);
