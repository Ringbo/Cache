diff --git a/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java b/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
index 8c0c00f..086fffa 100644
--- a/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
+++ b/main/ui/src/main/java/org/cryptomator/ui/model/Vault.java
@@ -168,7 +168,7 @@
 		);
 	}
 
-	public void reveal() throws CommandFailedException {
+	public synchronized void reveal() throws CommandFailedException {
 		Optionals.ifPresent(filesystemFrontend.get(), Frontend::reveal);
 	}
 
@@ -190,7 +190,7 @@
 	// Getter/Setter
 	// *******************************************************************************/
 
-	public String getWebDavUrl() {
+	public synchronized String getWebDavUrl() {
 		return filesystemFrontend.get().map(Frontend::getWebDavUrl).orElseThrow(IllegalStateException::new);
 	}
 
