diff --git a/src/com/ichi2/libanki/Sched.java b/src/com/ichi2/libanki/Sched.java
index 7f27852..9a8c176 100644
--- a/src/com/ichi2/libanki/Sched.java
+++ b/src/com/ichi2/libanki/Sched.java
@@ -1096,7 +1096,7 @@
 					if (conf.has("mult") && resched) {
 						// review that's lapsed
 						try {
-							card.setIvl(Math.max(1, card.getIvl() * conf.getInt("mult")));
+							card.setIvl(Math.max(1, (int)(card.getIvl() * conf.getDouble("mult"))));
 						} catch (JSONException e) {
 							throw new RuntimeException(e);
 						}
@@ -1539,7 +1539,7 @@
 
 	private int _nextLapseIvl(Card card, JSONObject conf) {
 		try {
-			return (int) (card.getIvl() * conf.getInt("mult")) + 1;
+			return (int) (card.getIvl() * conf.getDouble("mult")) + 1;
 		} catch (JSONException e) {
 			throw new RuntimeException(e);
 		}
@@ -1928,7 +1928,7 @@
 			dict.put("minInt", oconf.getJSONObject("lapse").getInt("minInt"));
 			dict.put("leechFails", oconf.getJSONObject("lapse").getInt("leechFails"));
 			dict.put("leechAction", oconf.getJSONObject("lapse").getInt("leechAction"));
-			dict.put("mult", oconf.getJSONObject("lapse").getInt("mult"));
+			dict.put("mult", oconf.getJSONObject("lapse").getDouble("mult"));
             // overrides
             dict.put("delays", delays);
             dict.put("resched", conf.getBoolean("resched"));
