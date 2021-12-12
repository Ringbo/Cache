diff --git a/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java b/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java
index d8d2baa..bef9743 100644
--- a/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java
+++ b/flexible-adapter/src/main/java/eu/davidea/flexibleadapter/FlexibleAdapter.java
@@ -5503,7 +5503,7 @@
 				headersShown = true;
 			}
 			IHeader header = getHeaderOf(item);
-			if (header != null && header.equals(sameHeader) && !isExpandable((T) header)) {
+			if (header != null && !header.equals(sameHeader) && !isExpandable((T) header)) {
 				header.setHidden(false);
 				sameHeader = header;
 				newItems.add(position, (T) header);
