diff --git a/src/com/ichi2/libanki/Sched.java b/src/com/ichi2/libanki/Sched.java
index 0ab3312..184fe0f 100644
--- a/src/com/ichi2/libanki/Sched.java
+++ b/src/com/ichi2/libanki/Sched.java
@@ -1444,12 +1444,12 @@
 				return idealIvl;
 			} else {
 				int leeway = Math.max(conf.getInt("minSpace"),
-						(int) (idealIvl * conf.getInt("fuzz")));
+						(int) (idealIvl * conf.getDouble("fuzz")));
 				int fudge = 0;
 				// do we have any room to adjust the interval?
 				if (leeway != 0) {
 					// loop through possible due dates for an empty one
-					for (int diff = 1; diff <= leeway + 1; diff++) {
+					for (int diff = 1; diff < leeway + 1; diff++) {
 						// ensure we're due at least tomorrow
 						if ((idealIvl - diff >= 1)
 								&& !dues.contains(idealDue - diff)) {
@@ -1719,7 +1719,7 @@
 			dict.put("ease4", oconf.getJSONObject("rev").getDouble("ease4"));
 			dict.put("fi", oconf.getJSONObject("rev").getJSONArray("fi"));
 			dict.put("minSpace", oconf.getJSONObject("rev").getInt("minSpace"));
-			dict.put("fuzz", oconf.getJSONObject("rev").getInt("fuzz"));
+			dict.put("fuzz", oconf.getJSONObject("rev").getDouble("fuzz"));
 			return dict;
 		} catch (JSONException e) {
 			throw new RuntimeException(e);
