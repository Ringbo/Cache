diff --git a/src/com/ichi2/libanki/Sched.java b/src/com/ichi2/libanki/Sched.java
index 20a032f..aa12ffd 100644
--- a/src/com/ichi2/libanki/Sched.java
+++ b/src/com/ichi2/libanki/Sched.java
@@ -2643,7 +2643,7 @@
         long now = Utils.intNow();
         ArrayList<Long> nids = new ArrayList<Long>();
         for (long id : cids) {
-        	long nid = mCol.getDb().queryScalar("SELECT nid FROM cards WHERE id = " + id);
+        	long nid = mCol.getDb().queryLongScalar("SELECT nid FROM cards WHERE id = " + id);
         	if (!nids.contains(nid)) {
         		nids.add(nid);
         	}
