diff --git a/xabber/src/main/java/com/xabber/android/data/http/PatreonManager.java b/xabber/src/main/java/com/xabber/android/data/http/PatreonManager.java
index f5808c2..b392d9e 100644
--- a/xabber/src/main/java/com/xabber/android/data/http/PatreonManager.java
+++ b/xabber/src/main/java/com/xabber/android/data/http/PatreonManager.java
@@ -96,7 +96,7 @@
             patreonGoals.add(patreonGoalRealm);
         }
 
-        PatreonRealm patreonRealm = new PatreonRealm();
+        PatreonRealm patreonRealm = new PatreonRealm("1");
         patreonRealm.setPledged(patreon.getPledged());
         patreonRealm.setString(patreon.getString());
         patreonRealm.setGoals(patreonGoals);
