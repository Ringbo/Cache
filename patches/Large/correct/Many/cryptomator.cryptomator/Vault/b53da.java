diff --git a/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java b/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
index f963c03..d615dac 100644
--- a/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
+++ b/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
@@ -216,7 +216,7 @@
 		return vaultSettings;
 	}
 
-	public String getWebDavUrl() {
+	public synchronized String getWebDavUrl() {
 		return servlet.getServletRootUri().toString();
 	}
 
