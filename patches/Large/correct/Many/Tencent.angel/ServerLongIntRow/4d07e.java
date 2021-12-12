diff --git a/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerLongIntRow.java b/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerLongIntRow.java
index 3060d70..f8026c7 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerLongIntRow.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/ps/storage/vector/ServerLongIntRow.java
@@ -186,8 +186,8 @@
     startWrite();
     try {
       switch (updateType) {
-        case T_DOUBLE_SPARSE_LONGKEY:
-        case T_DOUBLE_SPARSE_LONGKEY_COMPONENT:
+        case T_INT_SPARSE_LONGKEY:
+        case T_INT_SPARSE_LONGKEY_COMPONENT:
           updateUseSparse(buf, op);
           break;
 
@@ -232,9 +232,9 @@
 
   @Override public int size() {
     if(useIntKey) {
-      return ((IntFloatVector) row).size();
+      return ((IntIntVector) row).size();
     } else {
-      return (int)((LongFloatVector) row).size();
+      return (int)((LongIntVector) row).size();
     }
   }
 
