diff --git a/common/buildcraft/transport/TravelingItem.java b/common/buildcraft/transport/TravelingItem.java
index 5a1ad5b..4f2f24e 100644
--- a/common/buildcraft/transport/TravelingItem.java
+++ b/common/buildcraft/transport/TravelingItem.java
@@ -320,14 +320,14 @@
 
 	public static class TravelingItemCache {
 
-		private final IntHashMap itemCache = new IntHashMap();
+		private final Map<Integer, TravelingItem> itemCache = new MapMaker().weakValues().makeMap();
 
 		public void cache(TravelingItem item) {
-			itemCache.addKey(item.id, item);
+			itemCache.put(item.id, item);
 		}
 
 		public TravelingItem get(int id) {
-			return (TravelingItem) itemCache.lookup(id);
+			return itemCache.get(id);
 		}
 	}
 }
