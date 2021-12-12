diff --git a/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java b/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java
index 3ce69f9..0bfa020 100644
--- a/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java
+++ b/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java
@@ -1472,7 +1472,7 @@
         new GZIPInputStream(rule.getProjectFilesystem().newFileInputStream(path))) {
       manifest = new Manifest(input);
     } catch (Exception e) {
-      LOG.error(
+      LOG.warn(
           e,
           "Failed to deserialize fetched-from-cache manifest for rule %s with key %s",
           rule,
