diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/XidImpl.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/XidImpl.java
index 6ccf855..0b4b5bc 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/XidImpl.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/XidImpl.java
@@ -121,13 +121,13 @@
     @Override
     public byte[] getGlobalTransactionId()
     {
-        return globalId.clone();
+        return globalId;
     }
 
     @Override
     public byte[] getBranchQualifier()
     {
-        return branchId.clone();
+        return branchId;
     }
 
     @Override
@@ -139,13 +139,13 @@
     @Override
     public boolean equals( Object o )
     {
-        if ( !(o instanceof Xid) )
+        if ( !(o instanceof XidImpl) )
         {
             return false;
         }
         
-        return Arrays.equals( globalId, ((Xid) o).getGlobalTransactionId() ) &&
-               Arrays.equals( branchId, ((Xid) o).getBranchQualifier() );
+        return Arrays.equals( globalId, ((XidImpl) o).globalId ) &&
+               Arrays.equals( branchId, ((XidImpl) o).branchId );
     }
 
     private volatile int hashCode = 0;
