diff --git a/services/java/com/android/server/pm/Settings.java b/services/java/com/android/server/pm/Settings.java
index b7810ba..3838859 100644
--- a/services/java/com/android/server/pm/Settings.java
+++ b/services/java/com/android/server/pm/Settings.java
@@ -2331,7 +2331,7 @@
                 } else if (tagName.equals("signing-keyset")) {
                     long id = Long.parseLong(parser.getAttributeValue(null, "identifier"));
                     packageSetting.keySetData.addSigningKeySet(id);
-                    Slog.e(TAG, "Adding signing keyset " + Long.toString(id) + " to " + name);
+                    Slog.d(TAG, "Adding signing keyset " + Long.toString(id) + " to " + name);
                 } else if (tagName.equals("defined-keyset")) {
                     long id = Long.parseLong(parser.getAttributeValue(null, "identifier"));
                     String alias = parser.getAttributeValue(null, "alias");
