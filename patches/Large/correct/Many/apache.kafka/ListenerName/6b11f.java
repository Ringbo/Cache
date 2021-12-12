diff --git a/clients/src/main/java/org/apache/kafka/common/network/ListenerName.java b/clients/src/main/java/org/apache/kafka/common/network/ListenerName.java
index 1245b1f..07ce7de 100644
--- a/clients/src/main/java/org/apache/kafka/common/network/ListenerName.java
+++ b/clients/src/main/java/org/apache/kafka/common/network/ListenerName.java
@@ -42,7 +42,7 @@
     private final String value;
 
     public ListenerName(String value) {
-        Objects.requireNonNull("value should not be null");
+        Objects.requireNonNull(value, "value should not be null");
         this.value = value;
     }
 
