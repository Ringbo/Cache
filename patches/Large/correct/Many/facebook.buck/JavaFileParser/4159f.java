diff --git a/src/com/facebook/buck/jvm/java/JavaFileParser.java b/src/com/facebook/buck/jvm/java/JavaFileParser.java
index afdaca7..09e08f8 100644
--- a/src/com/facebook/buck/jvm/java/JavaFileParser.java
+++ b/src/com/facebook/buck/jvm/java/JavaFileParser.java
@@ -642,7 +642,7 @@
 
           simpleImportedTypes.put(name, enclosingType);
         } else {
-          LOG.error("Suspicious import lacks obvious enclosing type: %s", fullyQualifiedName);
+          LOG.warn("Suspicious import lacks obvious enclosing type: %s", fullyQualifiedName);
           // The one example we have seen of this in the wild is
           // "org.whispersystems.curve25519.java.curve_sigs". In practice, we still need to add it
           // as a required symbol in this case.
