diff --git a/core/common/src/main/java/alluxio/PropertyKey.java b/core/common/src/main/java/alluxio/PropertyKey.java
index 78ea6fb..1673cda 100644
--- a/core/common/src/main/java/alluxio/PropertyKey.java
+++ b/core/common/src/main/java/alluxio/PropertyKey.java
@@ -32,7 +32,7 @@
  * Configuration property keys. This class provides a set of pre-defined property keys.
  */
 @ThreadSafe
-public class PropertyKey implements Comparable<PropertyKey> {
+public final class PropertyKey implements Comparable<PropertyKey> {
   // The following two maps must be the first to initialize within this file.
   /** A map from default property key's string name to the key. */
   private static final Map<String, PropertyKey> DEFAULT_KEYS_MAP = new HashMap<>();
