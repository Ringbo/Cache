diff --git a/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java b/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
index a58741d..c7e619d 100644
--- a/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
+++ b/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
@@ -166,7 +166,7 @@
 
 	@Override
 	public boolean shouldSkipAuthentication(String cleartextPath) {
-		return namesOfResourcesWithInvalidMac.contains(cleartextPath);
+		return whitelistedResourcesWithInvalidMac.contains(cleartextPath);
 	}
 
 	// ******************************************************************************
