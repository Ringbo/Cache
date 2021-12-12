diff --git a/src/com/facebook/buck/autodeps/AutodepsWriter.java b/src/com/facebook/buck/autodeps/AutodepsWriter.java
index de133d6..8a6e0d2 100644
--- a/src/com/facebook/buck/autodeps/AutodepsWriter.java
+++ b/src/com/facebook/buck/autodeps/AutodepsWriter.java
@@ -203,9 +203,9 @@
       ObjectWriter jsonWriter = mapper.writer(PRETTY_PRINTER.get());
       jsonWriter.writeValue(hashingOutputStream, deps);
 
-      // Flush a trailing newline through the ByteArrayOutputStream so it is included in the
-      // HashingOutputStream.
-      bytes.write('\n');
+      // Flush a trailing newline through the HashingOutputStream so it is included both the
+      // output and the signature calculation.
+      hashingOutputStream.write('\n');
 
       HashCode hash = hashingOutputStream.hash();
       String serializedJson = bytes.toString(Charsets.UTF_8.name());
