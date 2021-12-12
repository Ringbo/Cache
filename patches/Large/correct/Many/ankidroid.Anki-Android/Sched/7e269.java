diff --git a/src/com/ichi2/libanki/Sched.java b/src/com/ichi2/libanki/Sched.java
index 3bc9abd..ffb22ee 100644
--- a/src/com/ichi2/libanki/Sched.java
+++ b/src/com/ichi2/libanki/Sched.java
@@ -267,7 +267,7 @@
             if (card.getODid() != 0 && card.getQueue() == 2) {
                 return 4;
             }
-            JSONObject conf = _lapseConf(card);
+            JSONObject conf = _lrnConf(card);
             try {
                 if (card.getType() == 0 || conf.getJSONArray("delays").length() > 1) {
                     return 3;
