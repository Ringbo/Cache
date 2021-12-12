diff --git a/src/java/org/jivesoftware/util/CertificateManager.java b/src/java/org/jivesoftware/util/CertificateManager.java
index 9ff69e2..48321e7 100644
--- a/src/java/org/jivesoftware/util/CertificateManager.java
+++ b/src/java/org/jivesoftware/util/CertificateManager.java
@@ -211,7 +211,7 @@
                         encoded = ((DERSequence) encoded).getObjectAt(1);
                         encoded = ((DERTaggedObject) encoded).getObject();
                         encoded = ((DERTaggedObject) encoded).getObject();
-                        String identity = ((DERUTF8String) encoded).getString();
+                        String identity = ((DERString) encoded).getString();
                         if (!"".equals(identity)) {
                             // Add the decoded server name to the list of identities
                             identities.add(identity);
