diff --git a/source/org/jivesoftware/smack/Roster.java b/source/org/jivesoftware/smack/Roster.java
index 8680cfc..3ac08e2 100644
--- a/source/org/jivesoftware/smack/Roster.java
+++ b/source/org/jivesoftware/smack/Roster.java
@@ -587,7 +587,7 @@
                 Map<String, Presence> userPresences;
                 // Get the user presence map
                 if (presenceMap.get(key) == null) {
-                    userPresences = new HashMap<String, Presence>();
+                    userPresences = new ConcurrentHashMap<String, Presence>();
                     presenceMap.put(key, userPresences);
                 }
                 else {
