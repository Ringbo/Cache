diff --git a/plugins/market/src/org/pentaho/di/core/market/entry/MarketEntries.java b/plugins/market/src/org/pentaho/di/core/market/entry/MarketEntries.java
index 46be267..47a271d 100644
--- a/plugins/market/src/org/pentaho/di/core/market/entry/MarketEntries.java
+++ b/plugins/market/src/org/pentaho/di/core/market/entry/MarketEntries.java
@@ -53,7 +53,7 @@
         List<Node> entryNodes = XMLHandler.getNodes(marketNode, MarketEntry.XML_TAG);
         for (Node entryNode : entryNodes) {
           MarketEntry entry = new MarketEntry(entryNode);
-          if (entry.getType() != MarketEntryType.Platform) {
+          if (entry.getType() != null && entry.getType() != MarketEntryType.Platform) {
             add(new MarketEntry(entryNode));
           }
         }
