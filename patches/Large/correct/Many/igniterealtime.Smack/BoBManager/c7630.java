diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/bob/BoBManager.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/bob/BoBManager.java
index 0c853a8..f7c7d26 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/bob/BoBManager.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/bob/BoBManager.java
@@ -159,7 +159,7 @@
 
     public BoBInfo addBoB(BoBData bobData) {
         // We only support SHA-1 for now.
-        BoBHash bobHash = new BoBHash("sha1", SHA1.hex(bobData.getContent()));
+        BoBHash bobHash = new BoBHash(SHA1.hex(bobData.getContent()), "sha1");
 
         Set<BoBHash> bobHashes = Collections.singleton(bobHash);
         bobHashes = Collections.unmodifiableSet(bobHashes);
