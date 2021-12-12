diff --git a/components/camel-atom/src/main/java/org/apache/camel/component/atom/UpdatedDateFilter.java b/components/camel-atom/src/main/java/org/apache/camel/component/atom/UpdatedDateFilter.java
index 8a78a1d..f5067a5 100644
--- a/components/camel-atom/src/main/java/org/apache/camel/component/atom/UpdatedDateFilter.java
+++ b/components/camel-atom/src/main/java/org/apache/camel/component/atom/UpdatedDateFilter.java
@@ -50,7 +50,8 @@
             return true;
         }        
         if (lastUpdate != null) {
-            if (lastUpdate.after(updated)) {
+            // we need to skip the latest updated entry
+            if (lastUpdate.after(updated) || lastUpdate.equals(updated)) {
                 LOG.debug("Entry is older than lastupdate=[{}], no valid entry=[{}]", lastUpdate, entry);
                 return false;
             }
