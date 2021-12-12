diff --git a/servers/src/main/java/tachyon/web/WebInterfaceGeneralServlet.java b/servers/src/main/java/tachyon/web/WebInterfaceGeneralServlet.java
index 3158d18..b9bca7e 100644
--- a/servers/src/main/java/tachyon/web/WebInterfaceGeneralServlet.java
+++ b/servers/src/main/java/tachyon/web/WebInterfaceGeneralServlet.java
@@ -125,7 +125,7 @@
 
     for (int ordinal = 0; ordinal < globalStorageTierAssoc.size(); ordinal ++) {
       String tierAlias = globalStorageTierAssoc.getAlias(ordinal);
-      if (totalBytesOnTiers.get(tierAlias) > 0) {
+      if (totalBytesOnTiers.containsKey(tierAlias) && totalBytesOnTiers.get(tierAlias) > 0) {
         StorageTierInfo info =
             new StorageTierInfo(tierAlias, totalBytesOnTiers.get(tierAlias),
                 usedBytesOnTiers.get(tierAlias));
