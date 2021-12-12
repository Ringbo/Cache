diff --git a/hazelcast-ra/src/main/java/com/hazelcast/jca/XAResourceImpl.java b/hazelcast-ra/src/main/java/com/hazelcast/jca/XAResourceImpl.java
index e94f636..06c3dce 100644
--- a/hazelcast-ra/src/main/java/com/hazelcast/jca/XAResourceImpl.java
+++ b/hazelcast-ra/src/main/java/com/hazelcast/jca/XAResourceImpl.java
@@ -217,7 +217,7 @@
 
     private void validateTx(Xid xid,Transaction.State state) throws XAException {
         final Transaction tx = getTransaction(xid);
-        if(tx == null) {
+        if(tx != null) {
             switch (state){
                 case ACTIVE:
                     if(tx.getState() != Transaction.State.ACTIVE){
