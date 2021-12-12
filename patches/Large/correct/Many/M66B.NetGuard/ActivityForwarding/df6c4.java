diff --git a/app/src/main/java/eu/faircode/netguard/ActivityForwarding.java b/app/src/main/java/eu/faircode/netguard/ActivityForwarding.java
index ce7373a..9a68792 100644
--- a/app/src/main/java/eu/faircode/netguard/ActivityForwarding.java
+++ b/app/src/main/java/eu/faircode/netguard/ActivityForwarding.java
@@ -165,7 +165,7 @@
 
                     @Override
                     protected List<Rule> doInBackground(Object... objects) {
-                        return Rule.getRules(false, ActivityForwarding.this);
+                        return Rule.getRules(true, ActivityForwarding.this);
                     }
 
                     @Override
