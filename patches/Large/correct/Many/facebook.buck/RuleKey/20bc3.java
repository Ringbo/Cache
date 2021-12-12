diff --git a/src/com/facebook/buck/rules/RuleKey.java b/src/com/facebook/buck/rules/RuleKey.java
index 0b78698..04640a1 100644
--- a/src/com/facebook/buck/rules/RuleKey.java
+++ b/src/com/facebook/buck/rules/RuleKey.java
@@ -374,7 +374,7 @@
       RuleKey totalRuleKey = new RuleKey(hasher.hash());
 
       if (logElms != null) {
-        logger.warn("RuleKey %s=%s", totalRuleKey, Joiner.on("").join(logElms));
+        logger.verbose("RuleKey %s=%s", totalRuleKey, Joiner.on("").join(logElms));
       }
 
       return ImmutableRuleKeyPair.of(totalRuleKey, ruleKeyWithoutDeps);
