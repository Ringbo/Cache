diff --git a/plugins/openpgp-api-lib/openpgp-api/src/main/java/org/openintents/openpgp/util/OpenPgpKeyPreference.java b/plugins/openpgp-api-lib/openpgp-api/src/main/java/org/openintents/openpgp/util/OpenPgpKeyPreference.java
index 6b407ff..47b3497 100644
--- a/plugins/openpgp-api-lib/openpgp-api/src/main/java/org/openintents/openpgp/util/OpenPgpKeyPreference.java
+++ b/plugins/openpgp-api-lib/openpgp-api/src/main/java/org/openintents/openpgp/util/OpenPgpKeyPreference.java
@@ -263,7 +263,7 @@
         public SavedState(Parcel source) {
             super(source);
 
-            keyId = source.readInt();
+            keyId = source.readLong();
             defaultUserId = source.readString();
         }
 
