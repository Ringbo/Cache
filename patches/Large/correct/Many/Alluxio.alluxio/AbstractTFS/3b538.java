diff --git a/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java b/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java
index 1558ce1..db019e4 100644
--- a/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java
+++ b/clients/unshaded/src/main/java/tachyon/hadoop/AbstractTFS.java
@@ -297,7 +297,8 @@
       ClientBlockInfo info = blocks.get(k);
       long offset = info.getOffset();
       long end = offset + info.getLength();
-      if ((offset >= start && offset <= start + len) || (end >= start && end <= start + len)) {
+      if ((offset >= start && offset <= start + len) || (end >= start && end <= start + len)
+          || (offset <= start && end >= start + len)) {
         ArrayList<String> names = new ArrayList<String>();
         ArrayList<String> hosts = new ArrayList<String>();
         for (NetAddress addr : info.getLocations()) {
