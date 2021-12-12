diff --git a/src/jvm/storm/trident/state/Serializer.java b/src/jvm/storm/trident/state/Serializer.java
index 0c18b71..9f91a38 100644
--- a/src/jvm/storm/trident/state/Serializer.java
+++ b/src/jvm/storm/trident/state/Serializer.java
@@ -5,5 +5,5 @@
 
 public interface Serializer<T> extends Serializable {
     byte[] serialize(T obj);
-    Object deserialize(byte[] b);
+    T deserialize(byte[] b);
 }
