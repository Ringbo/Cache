diff --git a/WordPress/src/main/java/org/wordpress/android/ui/publicize/PublicizeActions.java b/WordPress/src/main/java/org/wordpress/android/ui/publicize/PublicizeActions.java
index 7459a1d..3876c15 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/publicize/PublicizeActions.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/publicize/PublicizeActions.java
@@ -161,7 +161,7 @@
             }
 
             if (PublicizeTable.onlyExternalConnections(serviceId)) {
-                return totalAccounts > 0;
+                return totalExternalAccounts > 0;
             } else {
                 return totalAccounts > 0 || totalExternalAccounts > 0;
             }
