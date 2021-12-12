diff --git a/keystore/java/android/security/KeyStoreKeyConstraints.java b/keystore/java/android/security/KeyStoreKeyConstraints.java
index 0297323..202e38d 100644
--- a/keystore/java/android/security/KeyStoreKeyConstraints.java
+++ b/keystore/java/android/security/KeyStoreKeyConstraints.java
@@ -580,7 +580,7 @@
             } else if ("ctr".equals(modeLower)) {
                 return CTR;
             } else if ("gcm".equals(modeLower)) {
-                return CTR;
+                return GCM;
             } else {
                 throw new IllegalArgumentException("Unknown block mode: " + mode);
             }
