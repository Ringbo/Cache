diff --git a/src/main/java/org/mapdb/StoreWAL.java b/src/main/java/org/mapdb/StoreWAL.java
index 9b722f7..1963917 100644
--- a/src/main/java/org/mapdb/StoreWAL.java
+++ b/src/main/java/org/mapdb/StoreWAL.java
@@ -27,7 +27,7 @@
 
     public static final String TRANS_LOG_FILE_EXT = ".t";
 
-    protected static final long[] TOMBSTONE = new long[1];
+    protected static final long[] TOMBSTONE = new long[0];
 
     protected final Volume.Factory volFac;
     protected Volume log;
@@ -195,9 +195,9 @@
     protected <A> A get2(long ioRecid, Serializer<A> serializer) throws IOException {
         //check if record was modified in current transaction
         long[] r = modified.get(ioRecid);
-        //yes, read version
+        //no, read main version
         if(r==null) return super.get2(ioRecid, serializer);
-        //chech for tombstone (was deleted in current trans)
+        //check for tombstone (was deleted in current trans)
         if(r==TOMBSTONE || r.length==0) return null;
 
         //was modified in current transaction, so read it from trans log
@@ -692,7 +692,7 @@
 
     protected long[] getLinkedRecordsFromLog(long ioRecid){
         long[] ret0 = modified.get(ioRecid);
-        if(ret0!=null){
+        if(ret0!=null && ret0!=TOMBSTONE){
             long[] ret = new long[ret0.length];
             for(int i=0;i<ret0.length;i++){
                 long offset = ret0[i] & LOG_MASK_OFFSET;
