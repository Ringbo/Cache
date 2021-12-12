diff --git a/activemq-jpa-store/src/main/java/org/apache/activemq/store/jpa/JPAReferenceStoreAdapter.java b/activemq-jpa-store/src/main/java/org/apache/activemq/store/jpa/JPAReferenceStoreAdapter.java
index 6da437f..241f617 100644
--- a/activemq-jpa-store/src/main/java/org/apache/activemq/store/jpa/JPAReferenceStoreAdapter.java
+++ b/activemq-jpa-store/src/main/java/org/apache/activemq/store/jpa/JPAReferenceStoreAdapter.java
@@ -136,7 +136,7 @@
      * @see org.apache.activemq.store.ReferenceStoreAdapter#isStoreValid()
      */
     public boolean isStoreValid(){
-        return true;
+        return false;
     }
 
     /**
