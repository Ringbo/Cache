diff --git a/core/common/src/main/java/alluxio/PropertyKey.java b/core/common/src/main/java/alluxio/PropertyKey.java
index 19b74fd..f17bf25 100644
--- a/core/common/src/main/java/alluxio/PropertyKey.java
+++ b/core/common/src/main/java/alluxio/PropertyKey.java
@@ -31,9 +31,9 @@
 public class PropertyKey {
   // The following two maps must be the first to initialize within this file.
   /** A map from default property key's string name to the key. */
-  private static Map<String, PropertyKey> DEFAULT_KEYS_MAP = new HashMap<>();
+  private static final Map<String, PropertyKey> DEFAULT_KEYS_MAP = new HashMap<>();
   /** A map from default property key's string name to the key. */
-  private static Map<PropertyKey, Object> DEFAULT_VALUES = new HashMap<>();
+  private static final Map<PropertyKey, Object> DEFAULT_VALUES = new HashMap<>();
 
   public static final PropertyKey CONF_DIR =
       create(Name.CONF_DIR, String.format("${%s}/conf", Name.HOME));
