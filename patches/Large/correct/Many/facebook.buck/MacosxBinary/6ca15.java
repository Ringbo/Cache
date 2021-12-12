diff --git a/src/com/facebook/buck/apple/MacosxBinary.java b/src/com/facebook/buck/apple/MacosxBinary.java
index b9a197d..8e6f189 100644
--- a/src/com/facebook/buck/apple/MacosxBinary.java
+++ b/src/com/facebook/buck/apple/MacosxBinary.java
@@ -102,7 +102,7 @@
   }
 
   @Override
-  public RuleKey.Builder appendDetailsToRuleKey(RuleKey.Builder builder) throws IOException {
+  public RuleKey.Builder appendDetailsToRuleKey(RuleKey.Builder builder) {
     return builder;
   }
 }
