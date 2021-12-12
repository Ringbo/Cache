diff --git a/java/org/apache/naming/resources/WARDirContext.java b/java/org/apache/naming/resources/WARDirContext.java
index 5eaa36b..9a4293f 100644
--- a/java/org/apache/naming/resources/WARDirContext.java
+++ b/java/org/apache/naming/resources/WARDirContext.java
@@ -797,7 +797,7 @@
      * Entry tree lookup.
      */
     protected Entry treeLookup(Name name) {
-        if (name.isEmpty())
+        if (name.isEmpty() || entries == null)
             return entries;
         Entry currentEntry = entries;
         for (int i = 0; i < name.size(); i++) {
