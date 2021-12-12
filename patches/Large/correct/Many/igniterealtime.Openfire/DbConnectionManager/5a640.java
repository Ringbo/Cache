diff --git a/src/java/org/jivesoftware/database/DbConnectionManager.java b/src/java/org/jivesoftware/database/DbConnectionManager.java
index bcd774c..e657b2c 100644
--- a/src/java/org/jivesoftware/database/DbConnectionManager.java
+++ b/src/java/org/jivesoftware/database/DbConnectionManager.java
@@ -886,7 +886,7 @@
                 }
                 // If the version is greater than 6, automatically update the version information.
                 // Previous to version 6, the upgrade scripts set the version themselves.
-                if (version > 6) {
+                if (version >= 6) {
                     stmt = con.createStatement();
                     stmt.execute("UPDATE jiveVersion SET version=" + i + " WHERE name='wildfire'");
                     stmt.close();
