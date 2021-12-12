diff --git a/tightdb-java-core/src/main/java/com/tightdb/Group.java b/tightdb-java-core/src/main/java/com/tightdb/Group.java
index 8a71f34..0e015b3 100644
--- a/tightdb-java-core/src/main/java/com/tightdb/Group.java
+++ b/tightdb-java-core/src/main/java/com/tightdb/Group.java
@@ -229,7 +229,7 @@
 
     protected native String nativeToString(long nativeGroupPtr);
         
-    public boolean equals(Group other) {
+    public boolean equals(Object other) {
         if (other == null)
             return false;
         if (other == this)
