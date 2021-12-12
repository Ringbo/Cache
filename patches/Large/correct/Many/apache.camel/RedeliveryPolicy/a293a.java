diff --git a/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java b/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java
index 6cf9104..a4cc6ac 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java
@@ -367,7 +367,7 @@
     // -------------------------------------------------------------------------
     @Deprecated
     public long getRedeliverDelay() {
-        return getRedeliverDelay();
+        return getRedeliveryDelay();
     }
     
     @Deprecated
